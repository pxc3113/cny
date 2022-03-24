package com.ytc.app6.controller;


// import com.ytc.app6.service.ElectricMeterService;
// import com.ytc.app6.service.LuckHistoryService;

import java.util.List;
import java.util.Optional;

// import com.example.app6.dto.LuckHistory;
import com.ytc.app6.model.*;
import com.ytc.app6.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LuckHistoryController {

    @Autowired
    private LuckHistoryDao luckHistoryDao;
    // @Autowired
    // private LuckHistoryService LuckHistoryService;

 

    @RequestMapping
    public String get(Model model, 
        @RequestParam("page") Optional<Integer> page_, 
        @RequestParam("size") Optional<Integer> size_
        ) {
        int page = page_.orElse(1);
        int size = size_.orElse(4);
        List<LuckHistory> LuckHistoryList= luckHistoryDao.get(page,size);
        model.addAttribute("luckHistoryList", LuckHistoryList);
        model.addAttribute("size", size);

        model.addAttribute("previousPage", Math.max(page-1,1));
        model.addAttribute("oobl", page < 0);
        model.addAttribute("currentPage", page);
        model.addAttribute("nextPage", Math.min(page+1,LuckHistoryList.size()));
        model.addAttribute("oobr", page > LuckHistoryList.size());
        return "lustHistory/LuckHistoryList";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") Long id){
        luckHistoryDao.delete(id);
        return "redirect:/luckHistory";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model) {
        return "add";
    }

    // @RequestMapping("/add")
    // public String add(LuckHistory LuckHistory) {
    //     LuckHistoryService.add(LuckHistory);
    //     return "redirect:/LuckHistory/toFindAll";
    // }

    // @RequestMapping(value = "toUpdate")
    // public String toUpdate(Model model, Long id) {
    //     model.addAttribute("LuckHistory", LuckHistoryService.findById(id));
    //     return "update";
    // }

    // @RequestMapping(value = "update")
    // public String update(@RequestParam LuckHistory LuckHistory) {
    //     LuckHistoryService.update(LuckHistory);
    //     return "redirect:/LuckHistory/toFindAll";
    // }
    // @RequestMapping(value = "delete")
    // public String delete(@RequestParam LuckHistory LuckHistory) {
    //     LuckHistoryService.delete(LuckHistory);
    //     return "redirect:/LuckHistory/toFindAll";
    // }
}