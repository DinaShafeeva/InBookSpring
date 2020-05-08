package ru.itis.inbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itis.inbook.models.Book;
import ru.itis.inbook.models.Genre;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByIdBook(int id);
    List<Book> findBooksByGenre(Genre genre);
}
