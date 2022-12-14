package com.example.entity;

import javax.persistence.*;


@Entity
@Table(name = "book")
public class Book implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "author", length = 20)
    private String author;


    // Constructors

    /**
     * default constructor
     */
    public Book() {
    }

    /**
     * full constructor
     */
    public Book(Long id, String name, String author, Long tid) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Property accessors
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
