package org.jpadatabase.prueba.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="books")
public class Book {
    //1.Atributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String author;
    private String publisher;
    private Double price;
    private Integer pages;
    private Boolean isAvailabe = false;
    private LocalDate releaseDate;

    //2.Constructor
    public Book() {
    }

    public Book(Long id, String name, String description, String author, String publisher, Double price, Integer pages, Boolean isAvailabe, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.pages = pages;
        this.isAvailabe = isAvailabe;
        this.releaseDate = releaseDate;
    }
    //3.Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Boolean getAvailabe() {
        return isAvailabe;
    }

    public void setAvailabe(Boolean availabe) {
        isAvailabe = availabe;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }


    //4.To string method

}
