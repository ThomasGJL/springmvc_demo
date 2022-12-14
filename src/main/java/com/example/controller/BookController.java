package com.example.controller;

import com.example.entity.Book;
import com.example.entity.BookTag;
import com.example.service.BookService;
import com.example.service.BookTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookTagService bookTagService;

    @GetMapping("/showBook")
    public String showBook(Model model, @RequestParam String id) {
        Book book = new Book();
        book.setId(Long.valueOf(id));
        model.addAttribute("books", bookService.find(book));
        return "listBooks";
    }

    @GetMapping("/listBooks")
    public String listBooks(Model model) {

        model.addAttribute("books", bookService.list());
        return "listBooks";
    }

    @GetMapping("/listBooksByTag")
    public String listBooksByTag(Model model) {

        model.addAttribute("books", bookTagService.list());
        return "listBooksByTag";
    }

}
