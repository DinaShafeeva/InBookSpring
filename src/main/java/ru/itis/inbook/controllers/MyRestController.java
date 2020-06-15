package ru.itis.inbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.inbook.models.User;
import ru.itis.inbook.repository.UserRepository;
import ru.itis.inbook.service.UserService;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/usersrest")
    public ResponseEntity<List<User>> getPage(Model model) {
        model.addAttribute("users", userRepository.findAll());

        return ResponseEntity.ok(userRepository.findAll());
    }
}
