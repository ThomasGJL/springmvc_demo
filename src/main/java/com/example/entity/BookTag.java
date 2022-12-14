package com.example.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "booktag")
public class BookTag implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "tag_name", length = 20)
    private String tag_name;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Book.class, cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumns(value = {@JoinColumn(name = "tid", referencedColumnName = "id") })
    @OrderBy(value = "name")
    private List<Book> books = new ArrayList<Book>();

    /**
     * default constructor
     */
    public BookTag() {
    }

    /**
     * full constructor
     */
    public BookTag(Long id, String tag_name) {
        this.id = id;
        this.tag_name = tag_name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTag_name() {
        return this.tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }


    public List<Book> getBooks() {
        return this.books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
