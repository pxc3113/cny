package com.ytc.app5.dao;

import java.util.List;

import com.ytc.app5.model.Book;

public interface BookDao {
    public List<Book> get(int page, int size);
    public void add(Book book);
    public void down(Long id);
    public void up(Long id);
}