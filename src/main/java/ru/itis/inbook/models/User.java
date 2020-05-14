package ru.itis.inbook.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String hashPassword;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> bookList;
//
//    @OneToMany(mappedBy="user")
//    private List<Quote> quotes;

    private String confirmCode;

}
