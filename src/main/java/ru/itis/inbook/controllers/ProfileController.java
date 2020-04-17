package ru.itis.inbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.inbook.dto.BookDto;
import ru.itis.inbook.repository.BookRepository;
import ru.itis.inbook.security.UserDetailsImpl;

import java.util.List;

@Controller
public class ProfileController {

//    @Autowired
//    private BookRepository repository;
//
//    @GetMapping("/profile")
//    public List<BookDto> getAllBooks(){
//        BookDto bookDTO = new BookDto();
//        System.out.println("входит и выходит");
//        return bookDTO.from(repository.findAll());
//    }

    @GetMapping("/profile")
    public String getProfilePage(Authentication authentication, Model model) {
        if (authentication != null){
            UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
            model.addAttribute("user", userDetails.getUser());
            return "profile";
        } else return "redirect:/signIn";
    }

    @PostMapping("/profile")
    public String profile() {

        return "redirect:/profileChange";
    }
}
