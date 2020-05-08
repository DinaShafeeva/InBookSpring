package ru.itis.inbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

        int[] genres = new int[24];
        for (int i : genres) {
            i = 0;
        }

        for (Book item : list) {
            if (item.getGenre().equals(Genre.Adventure)) {
                genres[0]++;
            } else if (item.getGenre().equals(Genre.Art)) {
                genres[1]++;
            } else if (item.getGenre().equals(Genre.Contemporary)) {
                genres[2]++;
            } else if (item.getGenre().equals(Genre.Cooking)) {
                genres[3]++;
            } else if (item.getGenre().equals(Genre.Development)) {
                genres[4]++;
            } else if (item.getGenre().equals(Genre.Dystopian)) {
                genres[5]++;
            } else if (item.getGenre().equals(Genre.Guide)) {
                genres[6]++;
            } else if (item.getGenre().equals(Genre.FamiliesRelationships)) {
                genres[7]++;
            } else if (item.getGenre().equals(Genre.Fantasy)) {
                genres[8]++;
            } else if (item.getGenre().equals(Genre.ForChildren)) {
                genres[9]++;
            } else if (item.getGenre().equals(Genre.HistoricalFiction)) {
                genres[10]++;
            } else if (item.getGenre().equals(Genre.Health)) {
                genres[11]++;
            } else if (item.getGenre().equals(Genre.History)) {
                genres[12]++;
            } else if (item.getGenre().equals(Genre.Horror)) {
                genres[13]++;
            } else if (item.getGenre().equals(Genre.Humor)) {
                genres[14]++;
            } else if (item.getGenre().equals(Genre.Thriller)) {
                genres[15]++;
            } else if (item.getGenre().equals(Genre.Memoir)) {
                genres[16]++;
            } else if (item.getGenre().equals(Genre.Motivational)) {
                genres[17]++;
            } else if (item.getGenre().equals(Genre.Mystery)) {
                genres[18]++;
            } else if (item.getGenre().equals(Genre.Paranormal)) {
                genres[19]++;
            } else if (item.getGenre().equals(Genre.Personal)) {
                genres[20]++;
            } else if (item.getGenre().equals(Genre.Romance)) {
                genres[21]++;
            } else if (item.getGenre().equals(Genre.ScienceFiction)) {
                genres[22]++;
            } else if (item.getGenre().equals(Genre.Travel)) {
                genres[23]++;
            }


            while (recommendedBooks.size()<10){
                int max = getMax(genres);
               if (max == -1) {
                   for (int i = 1; i < 11; i++) {
                       if (bookRepository.findByIdBook(i) != null) {
                           if (!checkBook(bookRepository.findByIdBook(i), list)) {
                               recommendedBooks.add(bookRepository.findByIdBook(i));
                           }
                       }
                   }
                   return recommendedBooks;
               } else if (max == 0){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Adventure)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }
               else if (max == 1){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Art)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 2){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Contemporary)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 3){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Cooking)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 4){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Development)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 5){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Dystopian)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 6){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Guide)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 7){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.FamiliesRelationships)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 8){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Fantasy)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 9){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.ForChildren)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 10){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.HistoricalFiction)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 11){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Health)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 12){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.History)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 13){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Horror)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 14){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Humor)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 15){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Thriller)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 16){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Memoir)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 17){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Motivational)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 18){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Mystery)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 19){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Paranormal)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 20){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Personal)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 21){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Romance)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }else if (max == 22){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.ScienceFiction)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }
               else if (max == 23){
                   for (Book book :  bookRepository.findBooksByGenre(Genre.Travel)){
                       if (!checkBook(book, list)){
                           recommendedBooks.add(book);
                       }
                   }
               }
               genres[max]=0;
           }
        }
        return recommendedBooks;
    }

    private Boolean checkBook(Book book, List<Book> list) {
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
