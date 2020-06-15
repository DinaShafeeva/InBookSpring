package ru.itis.inbook.service;

import ru.itis.inbook.dto.BookSearchResult;

public interface SearchService {
    BookSearchResult searchBooks(String query, Integer page, Integer size);
}
