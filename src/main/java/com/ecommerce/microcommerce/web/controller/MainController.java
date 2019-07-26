package com.ecommerce.microcommerce.web.controller;

import java.util.List;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @Autowired
    ProductDao productDao;

    @GetMapping(value = "/index")
    public String Index(Model model,@RequestParam(name="title",required = false) String title ) {
        List<Product> products = productDao.findAll();
        model.addAttribute("products", products);
        model.addAttribute("title",title);
        return "index";
    }
}
