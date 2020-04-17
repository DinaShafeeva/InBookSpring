package ru.itis.inbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itis.inbook.models.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
//    @Query("select h from Book h where h.book=?1")
//    List<Book> searchByName(String name);
//    List<Book> findBookByName(String name);
}
