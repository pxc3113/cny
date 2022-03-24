package com.example.app8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/frame")
@Controller
public class FrameController {
    @GetMapping("/left")
    public String left(){
        return "frames/left";
    }
    @GetMapping("/right")
    public String right(){
        return "frames/right";
    }
    @GetMapping("/top")
    public String top(){
        return "frames/top";
    }
}
