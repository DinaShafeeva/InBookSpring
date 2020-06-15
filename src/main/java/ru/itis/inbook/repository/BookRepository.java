package ru.itis.inbook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itis.inbook.models.Book;
import ru.itis.inbook.models.Genre;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByIdBook(int id);
    List<Book> findBooksByGenre(Genre genre);

    @Query("from Book book where " +
            "(upper(book.nameOfBook) like concat('%', upper(:query), '%') or " +
            "upper(book.author) like concat('%', upper(:query), '%'))")
    Page<Book> search(@Param("query") String query, Pageable pageable);
}
