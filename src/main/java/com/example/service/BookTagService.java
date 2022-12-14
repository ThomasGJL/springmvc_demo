package com.example.service;

import com.example.entity.BookTag;

import java.util.List;

public interface BookTagService {

    List<BookTag> find(BookTag bookTag);
    List<BookTag> list();

}
