package com.ytc.app6.controller;

import java.util.List;
import java.util.Optional;

import com.ytc.app6.dao.*;
import com.ytc.app6.form.PrizeSearchForm;
import com.ytc.app6.model.Prize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prize")
public class PrizeController {
    @Autowired
    PrizeDao prizeDao;
    @Autowired
    LuckHistoryDao luckHistoryDao;
    @RequestMapping
    public String get(
        Model model,
        @RequestParam("page") Optional<Integer> page_, 
        @RequestParam("size") Optional<Integer> size_,
        PrizeSearchForm prizeSearchForm
    ){
        int page = page_.orElse(1);
        int size = size_.orElse(4);
        List<Prize> prizeList= prizeDao.get(page,size, prizeSearchForm);
        model.addAttribute("prizeList", prizeList);
        model.addAttribute("prizeSearchForm", prizeSearchForm);
        model.addAttribute("previousPage", Math.max(page-1,1));
        model.addAttribute("currentPage", page);
        model.addAttribute("nextPage", Math.min(page+1,prizeList.size()));
        return "prize/PrizeList";
    }

    @GetMapping("claim")
    public String claim(@RequestParam("id") Long pid){
        prizeDao.claim(pid);
        luckHistoryDao.claim(pid);
        return "redirect:/prize";
    }
}
