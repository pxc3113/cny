package com.example.app7.controller;

import com.example.app7.service.ElectricMeterService;
import com.example.app7.service.VIIClassService;

import java.util.List;
import java.util.Optional;

import com.example.app7.dto.*;
// import com.example.app7.dto.VIIClass;
import com.example.app7.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
// import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/viiClass")
public class VIIClassController {

    @Autowired
    private VIIClassService viiClassService;
    @Autowired
    private ElectricMeterService electricMeterService;

    @PostMapping("charge/{eid},{cid}")
    public String charge(@PathVariable("eid") String eid, @PathVariable("cid") String cid, Model model, @ModelAttribute("chargeDto") ChargeDto chargeDto){
        chargeDto.setEid(Long.parseLong(eid));
        chargeDto.setCid(Long.parseLong(cid));
        if (chargeDto.getUnit()==1){
            chargeDto.setDelta(chargeDto.getDelta()*1000);
            chargeDto.setUnit(0);
        }
        chargeDto.setCost(chargeDto.getDelta()*2);
        viiClassService.charge(chargeDto);
        electricMeterService.charge(chargeDto);
        return "redirect:/viiClass";
    }

    @RequestMapping("toCharge")
    public String toCharge(Model model, @RequestParam("eid") String eid, @RequestParam("cid") String cid ,@RequestParam("viiClassName") String name){
        VIIClass viiClass = viiClassService.getById(Long.parseLong(cid));
        model.addAttribute("viiClass",viiClass);
        ChargeDto chargeDto = new ChargeDto();
        chargeDto.setEid(Long.parseLong(eid));
        chargeDto.setCid(Long.parseLong(cid));
        model.addAttribute("chargeDto",chargeDto);
        return "charge";
    }

    @RequestMapping
    public String get(Model model, 
        @RequestParam("page") Optional<Integer> page_, 
        @RequestParam("size") Optional<Integer> size_,
        VIIClassDto viiClassDto
        ) {
        int page = page_.orElse(1);
        int size = size_.orElse(10);
        if (viiClassDto.getFromUnit()==1){
            viiClassDto.setElectricityFrom(viiClassDto.getElectricityFrom()*1000);
            viiClassDto.setFromUnit(0);
        } 
        if (viiClassDto.getToUnit()==1){
            viiClassDto.setElectricityTo(viiClassDto.getElectricityTo()*1000);
            viiClassDto.setToUnit(0);
        } 
        List<VIIClass> viiClassList= viiClassService.get(page,size,viiClassDto);
        model.addAttribute("viiClassDto", viiClassDto);
        model.addAttribute("viiClassList", viiClassList);
        model.addAttribute("size", size);

        model.addAttribute("previousPage", Math.max(page-1,1));
        model.addAttribute("oobl", page < 0);
        model.addAttribute("currentPage", page);
        model.addAttribute("nextPage", Math.min(page+1,viiClassList.size()));
        model.addAttribute("oobr", page > viiClassList.size());
        return "VIIClassList";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model) {
        return "add";
    }

    @RequestMapping("/add")
    public String add(VIIClass viiclass) {
        viiClassService.add(viiclass);
        return "redirect:/viiclass/toFindAll";
    }

    // @RequestMapping(value = "toUpdate")
    // public String toUpdate(Model model, Long id) {
    //     model.addAttribute("viiclass", viiClassService.findById(id));
    //     return "update";
    // }

    @RequestMapping(value = "update")
    public String update(@RequestParam VIIClass viiclass) {
        viiClassService.update(viiclass);
        return "redirect:/viiclass/toFindAll";
    }
    // @RequestMapping(value = "delete")
    // public String delete(@RequestParam VIIClass viiclass) {
    //     viiClassService.delete(viiclass);
    //     return "redirect:/viiclass/toFindAll";
    // }
}
