package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.dao.BookTagDao;
import com.example.entity.BookTag;
import com.example.service.BookTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTagServiceImpl implements BookTagService {

    @Autowired
    BookTagDao bookTagDao;

    @Override
    public List<BookTag> find(BookTag bookTag) {
        return bookTagDao.find(bookTag);
    }

    @Override
    public List<BookTag> list() {
        return bookTagDao.list();
    }
}
