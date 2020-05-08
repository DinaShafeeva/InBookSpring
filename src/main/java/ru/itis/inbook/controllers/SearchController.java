package ru.itis.inbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.inbook.security.UserDetailsImpl;
import ru.itis.inbook.service.FindBooksService;

@Controller
public class SearchController {

    @Autowired
    FindBooksService findBooksService;

    @GetMapping("/search")
    public String getSearchPage(Authentication authentication, Model model) {
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        model.addAttribute("booksList", findBooksService.getBookList(userDetails.getUser().getBookList()));
        return "search";
    }

    @PostMapping("/search")
    public String search(Authentication authentication, @RequestParam("book_id")String idBook
    ) {
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        Long idUser = userDetails.getUser().getId();



        return "redirect:/search";
    }
}
