package ru.itis.inbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String getProfilePage() {
        return "search";
    }

    @PostMapping("/search")
    public String profile() {

        return "redirect:/search";
    }
}
