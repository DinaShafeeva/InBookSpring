package ru.itis.inbook.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "BOOK")
public class Book {

    @Id
    @Column(name = "ID_BOOk")
    @GeneratedValue
    private int idBook;

    @Column(name = "NAME_OF_BOOK")
    private String nameOfBook;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "GENRE")
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> userList;

}
