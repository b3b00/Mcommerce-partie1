package com.ecommerce.microcommerce.web.controller;


import com.ecommerce.microcommerce.dao.GitHubDao;
import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.GitHubEvent;
import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.exceptions.ProduitGratuitException;
import com.ecommerce.microcommerce.web.exceptions.ProduitIntrouvableException;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(description = "API pour es opérations CRUD sur les produits.")

@RestController
public class GitHubController {

    @Autowired
    private GitHubDao githubdao;


    // Récupérer la liste des produits

    @PostMapping(value = "/github/")

    public void hook(@RequestBody String payload) {
        GitHubEvent event = new GitHubEvent();
        event.setPayload(payload);
        event.setDate(new Date());
        githubdao.save(event);
    }

   

}
