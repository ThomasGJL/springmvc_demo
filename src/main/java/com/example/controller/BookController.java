package com.example.controller;

import com.example.service.BookService;
import com.example.service.BookTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookTagService bookTagService;

    @GetMapping("/listBooks")
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.list());
        return "listBooks";
    }

}
