package ru.itis.inbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.inbook.dto.BookSearchResult;
import ru.itis.inbook.models.Book;
import ru.itis.inbook.repository.BookRepository;
import ru.itis.inbook.repository.UserRepository;
import ru.itis.inbook.security.UserDetailsImpl;
import ru.itis.inbook.service.FindBooksService;
import ru.itis.inbook.service.SearchService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class SearchController {

    @Autowired
    FindBooksService findBooksService;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private SearchService service;

    BookSearchResult bookSearchResult;

    @GetMapping("/search")
    public String getSearchPage(Authentication authentication, Model model) {
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        model.addAttribute("booksList", findBooksService.getBookList(userDetails.getUser().getBookList()));
        model.addAttribute("foundBook", null);
        return "search";
    }

    @PostMapping("/search")
    public String search(Authentication authentication, @RequestParam("book_id")String idBook
    ) {
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        userDetails.getUser().getBookList().add(bookRepository.findByIdBook(Integer.parseInt(idBook)));
        userRepository.save(userDetails.getUser());
        return "redirect:/search";
    }

    @PostMapping("/searchBook")
    public String searchBook(Model model, Authentication authentication, @RequestParam("q") String query,
                             String searchBook) {
        bookSearchResult = service.searchBooks(query, 0,10);
        model.addAttribute("foundBook", bookSearchResult);
        System.out.println(bookSearchResult.toString());
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        model.addAttribute("booksList", findBooksService.getBookList(userDetails.getUser().getBookList()));
        return "search";
    }
}
