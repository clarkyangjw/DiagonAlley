package com.clark.controller;

import com.clark.pojo.AdvertisingCategory;
import com.clark.service.AdvertisingCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    AdvertisingCategoryService advertisingCategoryService;

    @GetMapping("/")
    public String toIndex(Model model) {
        List<AdvertisingCategory> advertisingCategory = advertisingCategoryService.getAdvertisingCategory();
        model.addAttribute("adCategory", advertisingCategory);
        return "index";
    }

}
