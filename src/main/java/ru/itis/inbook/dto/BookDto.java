package ru.itis.inbook.dto;

import lombok.*;
import ru.itis.inbook.models.Book;
import ru.itis.inbook.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDto {

    private int idBook;
    private String nameOfBook;
    private String author;
    private List<Book> bookList;

     static BookDto from(Book book) {
        return BookDto.builder()
                .idBook(book.getIdBook())
                .nameOfBook(book.getNameOfBook())
                .author(book.getAuthor())
                .build();
    }

    public List<BookDto> from(List<Book> books) {
        return books.stream()
                .map(BookDto::from)
                .collect(Collectors.toList());
    }
}
