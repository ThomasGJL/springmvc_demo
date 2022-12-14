package com.example.dao.impl;

import com.example.dao.BookTagDao;
import com.example.entity.BookTag;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookTagDaoImpl implements BookTagDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<BookTag> find(BookTag bookTag) {
        TypedQuery<BookTag> query = sessionFactory.getCurrentSession().createQuery("from BookTag where tag_name = ?");
        query.setParameter(0, bookTag.getTag_name());
        return query.getResultList();
    }

    @Override
    public List<BookTag> list() {
        TypedQuery<BookTag> query = sessionFactory.getCurrentSession().createQuery("from BookTag as bt left join fetch bt.books");
        return query.getResultList();
    }
}
