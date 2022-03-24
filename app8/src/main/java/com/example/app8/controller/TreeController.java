package com.example.app8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/tree")
public class TreeController {
    @Autowired
    TreeDao treeDao;
    @GetMapping
    public List<Node> get(){
        return treeDao.get();
    }
}
