package com.ecommerce.microcommerce.web.controller;

import java.util.List;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @Autowired
    ProductDao productDao;

    private String RefreshIndex(Model model) {
        List<Product> products = productDao.findAll();
        model.addAttribute("products", products);
        model.addAttribute("prod", new Product());
        return "index";
    }

    @GetMapping(value = "/index")
    public String Index(Model model) {
        return RefreshIndex(model);
    }

    @GetMapping(value = "/delete/{pid}")
    public String Index(Model model,@PathVariable(name="pid",required = true) String pid ) {
        productDao.delete(Integer.parseInt(pid));
        return RefreshIndex(model);
    }
    @PostMapping(value="/add") 
    public String Add(Model model,@ModelAttribute Product product) {
        productDao.save(product);
        return RefreshIndex(model);
    }

}
