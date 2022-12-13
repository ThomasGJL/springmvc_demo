package com.example.dao.impl;

import com.example.dao.BookDao;
import com.example.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> find(Book book) {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where name = ?");
        query.setParameter(0, book.getName());
        return query.getResultList();
    }

    @Override
    public List<Book> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
        return query.getResultList();
    }
}
