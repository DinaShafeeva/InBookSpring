package ru.itis.inbook.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "QUOTE")
public class Quote {

    @Id
    @Column(name = "ID_QUOTE")
    @GeneratedValue
    private Long idQuote;

    @Column(name = "QUOTE_TEXT")
    private String quoteText;

    @ManyToOne
    @JoinColumn(name="ID_BOOK", nullable=false)
    private Book book;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="ID", nullable=false)
    private User user;
}
