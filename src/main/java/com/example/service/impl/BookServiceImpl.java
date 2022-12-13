package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    @Transactional(readOnly = true)
    public List<Book> find(Book book) {
        return bookDao.find(book);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Book> list() {
        return bookDao.list();
    }
}
