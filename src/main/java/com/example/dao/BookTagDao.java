package com.example.dao;

import com.example.entity.BookTag;

import java.util.List;

public interface BookTagDao {

    List<BookTag> find(BookTag bookTag);
    List<BookTag> list(BookTag bookTag);

}
