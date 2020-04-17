package ru.itis.inbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.inbook.dto.SignUpDto;
import ru.itis.inbook.service.ProfileChangeService;

@Controller
public class ProfileChangeController {

    @Autowired
    ProfileChangeService profileChangeService;

    @GetMapping("/profileChange")
    public String getProfilePage() {
        return "profileChange";
    }

    @PostMapping("/profileChange")
    public String profile(SignUpDto user) {
        profileChangeService.update(user);
        return "redirect:/profile";
    }
}
