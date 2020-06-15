package ru.itis.inbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.itis.inbook.dto.BookDto;
import ru.itis.inbook.dto.BookSearchResult;
import ru.itis.inbook.dto.UserDto;
import ru.itis.inbook.models.Book;
import ru.itis.inbook.repository.BookRepository;
import ru.itis.inbook.repository.UserRepository;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookSearchResult searchBooks(String query, Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Book> pageResult;
        pageResult = bookRepository.search(query,  pageRequest);
        List<BookDto> books = BookDto.from(pageResult.getContent());
        return BookSearchResult.builder()
                .book(books)
                .count(pageResult.getTotalPages())
                .build();
    }
}
