package ru.itis.inbook.repository;

import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.itis.inbook.models.Book;
import ru.itis.inbook.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
    Optional<User> findByConfirmCode(String confirmCode);
    List<User> findAllByLoginContainsIgnoreCase(String login);
    List<User> findAll();
}
