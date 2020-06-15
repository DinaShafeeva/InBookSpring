package ru.itis.inbook.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;
import ru.itis.inbook.security.UserDetailsImpl;


@Controller
public class ProfileController {

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
