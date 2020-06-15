package ru.itis.inbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import ru.itis.inbook.models.Book;
import ru.itis.inbook.models.Genre;
import ru.itis.inbook.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindBooksServiceImpl implements FindBooksService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getBookList(List<Book> list) {
        List<Book> recommendedBooks = new ArrayList<>();
        if (list.size()==0){
            for (int i = 1; i < 11; i++) {
                if (bookRepository.findByIdBook(i) != null) {
                    if ((!checkBook(bookRepository.findByIdBook(i), list)) && (!checkBookInRecommended(bookRepository.findByIdBook(i), recommendedBooks))) {
                        recommendedBooks.add(bookRepository.findByIdBook(i));
                    }
                }
            }
        }
        int[] genres = new int[24];
        for (int i : genres) {
            i = 0;
        }

        Genre[] genreNames = Genre.values();

        for (Book item : list) {
            genres[item.getGenre().getId()]++;
        }

            while (recommendedBooks.size()<10){
                int max = getMax(genres);
                if (max == -1)  {
                   for (int i = 1; i < 11; i++) {
                       if (bookRepository.findByIdBook(i) != null) {
                           if ((!checkBook(bookRepository.findByIdBook(i), list)) && (!checkBookInRecommended(bookRepository.findByIdBook(i), recommendedBooks))) {
                               recommendedBooks.add(bookRepository.findByIdBook(i));
                           }
                       }
                   }
                   return recommendedBooks;
               }  for (Book book :  bookRepository.findBooksByGenre(genreNames[max])){
                       if ((!checkBook(book, list)) && (!checkBookInRecommended(book, recommendedBooks))){
                           recommendedBooks.add(book);
                       }
                   }
               genres[max]=0;
           }

        return recommendedBooks;
    }

    private Boolean checkBook(Book book, List<Book> list) {
        for (Book item : list) {
            if (item.getIdBook() == book.getIdBook()) return true;
        }
        return false;
    }

    private Boolean checkBookInRecommended(Book book, List<Book> list) {
        for (Book item : list) {
            if (item.getIdBook() == book.getIdBook()) return true;
        }
        return false;
    }

    private int getMax(int[] arr){
        int max = 0;
        int index = -1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
