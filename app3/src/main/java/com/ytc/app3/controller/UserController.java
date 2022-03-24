package com.ytc.app3.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.ytc.app3.dao.*;
import com.ytc.app3.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("toLogin")
    public String toLogin(Model model){
        model.addAttribute("user",new User());
        return "user/login";
    }

    @PostMapping("login")
    @ResponseBody
    public String login(User user, HttpServletRequest request){
        Optional<User> u = userDao.getByName(user.getName());
        if (u.isPresent() && u.get().getPassword().equals(user.getPassword())){
            request.getSession().setAttribute("user",user);
            return "0";
        } else {
            return "1";
        }
    }

    @RequestMapping
    public String get(Model model, 
        @RequestParam("page") Optional<Integer> page_, 
        @RequestParam("size") Optional<Integer> size_
        ) {
        int page = page_.orElse(1);
        int size = size_.orElse(20);
        List<User> UserList= userDao.get(page,size);
        model.addAttribute("UserList", UserList);
        model.addAttribute("size", size);

        model.addAttribute("previousPage", Math.max(page-1,1));
        model.addAttribute("oobl", page < 0);
        model.addAttribute("currentPage", page);
        model.addAttribute("nextPage", Math.min(page+1,UserList.size()));
        model.addAttribute("oobr", page > UserList.size());
        return "user/UserList";
    }

    @GetMapping("/toRegister")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "user/register";
    }
    @PostMapping("/register")
    public String register(User User){
        
        userDao.register(User);
        return "redirect:/user";
    }

}