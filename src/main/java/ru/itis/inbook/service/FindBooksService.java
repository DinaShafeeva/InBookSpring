package ru.itis.inbook.service;

import ru.itis.inbook.models.Book;

import java.util.List;

public interface FindBooksService {
    List<Book> getBookList(List<Book> list);
}
