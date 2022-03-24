package com.example.app8.controller;

import java.util.List;
import java.util.Optional;

import com.example.app8.dao.PurchaseDao;
import com.example.app8.dto.PurchaseDto;
import com.example.app8.model.Purchase;
import com.example.app8.service.PurchaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RequestMapping("purchase")
public class PurchaseController {
    
    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping
    public String get(
        Model model, 
        @RequestParam("page") Optional<Integer> page_, 
        @RequestParam("size") Optional<Integer> size_,
        PurchaseDto purchaseDto
    ){
        int page = page_.orElse(1);
        int size = size_.orElse(10);
        // model.addAttribute("purchaseDto",purchaseDto);
        List<Purchase> purchaseList = purchaseService.get(page,size,purchaseDto);
        model.addAttribute("purchaseList", purchaseList);
        model.addAttribute("size", size);

        model.addAttribute("previousPage", Math.max(page-1,1));
        model.addAttribute("oobl", page < 0);
        model.addAttribute("currentPage", page);
        model.addAttribute("nextPage", Math.min(page+1,purchaseList.size()));
        model.addAttribute("oobr", page > purchaseList.size());
        return "listPurchase";
    }

    @GetMapping("/toUpdate")
    public String toUpdate(Model model, @RequestParam("id") String id){
        Purchase purchase = purchaseService.getById(Long.parseLong(id));
        System.out.println(purchase);
        model.addAttribute("purchase", purchase);
        return "updatePurchase";
    }

    @PostMapping("update/{id}")
    public String update(@PathVariable("id") String id, @ModelAttribute Purchase purchase, Model model){
        purchase.setId(Long.parseLong(id));
        if (purchase.getPurchaseDate().length()==0){
            purchase.setPurchaseDate(null);
        }
        purchaseService.update(purchase);
        return "redirect:/purchase";   
    }

    @RequestMapping("pin/{id}")
    public String pin(@PathVariable("id") String id){
        purchaseService.pin(Long.parseLong(id));
        return "redirect:/purchase";
    }
}
