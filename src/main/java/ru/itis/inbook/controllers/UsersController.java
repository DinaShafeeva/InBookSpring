package ru.itis.inbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.inbook.dto.UserDto;
import ru.itis.inbook.repository.UserRepository;
import ru.itis.inbook.service.UserService;


@Controller
public class UsersController {

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;


    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/users")
    public String getPage(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }
}
