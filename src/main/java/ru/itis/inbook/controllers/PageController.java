package ru.itis.inbook.controllers;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.inbook.models.PageData;

@Controller
public class PageController {

    @Autowired
    private PageData pageData;

@RequestMapping("/rooms/{room-id}")
    public String rooms(@PathVariable("room-id") String id, Model model) {
        int count = pageData.getCount();
        pageData.onVisit();
        model.addAttribute("room_id", id);
        model.addAttribute("count", count);
        return "room";
    }

}