package com.ytc.app4.controller;

import java.util.List;
import java.util.Optional;

import com.ytc.app4.dao.*;
import com.ytc.app4.model.*;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private BookTypeDao bookTypeDao;

    @RequestMapping
    public String get(Model model, 
        @RequestParam("page") Optional<Integer> page_, 
        @RequestParam("size") Optional<Integer> size_
        ) {
        int page = page_.orElse(1);
        int size = size_.orElse(100);
        List<Book> BookList= bookDao.get(page,size);
        model.addAttribute("BookList", BookList);
        model.addAttribute("size", size);

        model.addAttribute("previousPage", Math.max(page-1,1));
        model.addAttribute("oobl", page < 0);
        model.addAttribute("currentPage", page);
        model.addAttribute("nextPage", Math.min(page+1,BookList.size()));
        model.addAttribute("oobr", page > BookList.size());
        return "book/BookList";
    }

    @PostMapping("/add")
    public String add(Book book){
        bookDao.add(book);
        return "redirect:/book";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model) {
        List<BookType> bookTypeList = bookTypeDao.get();
        model.addAttribute("bookTypeList",bookTypeList);
        model.addAttribute("book",new Book());
        return "book/AddBook";
    }

    @RequestMapping("/up")
    public String up(@RequestParam("id") Long id){
        bookDao.up(id);
        return "redirect:/book";
    }

    @RequestMapping("/down")
    public String down(@RequestParam("id") Long id){
        bookDao.down(id);
        return "redirect:/book";
    }
}