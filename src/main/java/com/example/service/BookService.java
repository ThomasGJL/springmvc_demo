package com.example.service;

import com.example.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> find(Book book);
    List<Book> list();
}
