package com.example.dao;

import com.example.entity.Book;

import java.util.List;

public interface BookDao {

    List<Book> find(Book book);
    List<Book> list();

}
