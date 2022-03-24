package com.example.app8.controller;

import java.util.List;

import com.example.app8.dao.StatusDao;
import com.example.app8.model.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @Autowired
    private StatusDao statusDao;

    @RequestMapping("/status")
    public List<Status> get(){
        return statusDao.get();
    }
}
