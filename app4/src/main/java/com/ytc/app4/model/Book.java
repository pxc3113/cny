package com.ytc.app4.model;


public class Book {
    private Long id;

    private String name;

    private Long price;

    private String show;

    private Long up;

    private BookType bookType;

    private User user;

    public Book() {
    }

    public Book(Long id, String name, Long price, String show, Long up, BookType bookType, User user) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.show = show;
        this.up = up;
        this.bookType = bookType;
        this.user = user;
    }

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

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getShow() {
        return this.show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public Long getUp() {
        return this.up;
    }

    public void setUp(Long up) {
        this.up = up;
    }

    public BookType getBookType() {
        return this.bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book id(Long id) {
        setId(id);
        return this;
    }

    public Book name(String name) {
        setName(name);
        return this;
    }

    public Book price(Long price) {
        setPrice(price);
        return this;
    }

    public Book show(String show) {
        setShow(show);
        return this;
    }

    public Book up(Long up) {
        setUp(up);
        return this;
    }

    public Book bookType(BookType bookType) {
        setBookType(bookType);
        return this;
    }

    public Book user(User user) {
        setUser(user);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", show='" + getShow() + "'" +
            ", up='" + getUp() + "'" +
            ", bookType='" + getBookType() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }

}