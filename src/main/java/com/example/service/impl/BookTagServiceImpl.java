package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.dao.BookTagDao;
import com.example.entity.BookTag;
import com.example.service.BookTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookTagServiceImpl implements BookTagService {

    @Autowired
    BookTagDao bookTagDao;

    @Override
    @Transactional(readOnly = true)
    public List<BookTag> find(BookTag bookTag) {
        return bookTagDao.find(bookTag);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BookTag> list() {
        return bookTagDao.list();
    }
}
