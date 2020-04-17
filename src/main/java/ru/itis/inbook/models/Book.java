package ru.itis.inbook.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    private Long idBook;

    @Column(name = "NAME_OF_BOOK")
    private String nameOfBook;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "ID_GENRE")
    private String idGenre;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<User> userList;

}
