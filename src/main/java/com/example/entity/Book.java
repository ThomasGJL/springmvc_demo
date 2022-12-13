package com.example.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "book")
public class Book implements java.io.Serializable {
    // Fields
    private Long id;
    private String name;
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
    public Book(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name = "name", length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "author", length = 20)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
