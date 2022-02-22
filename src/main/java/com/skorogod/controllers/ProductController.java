package com.skorogod.controllers;

import com.skorogod.entities.Product;
import com.skorogod.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping("/products")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveAll(products);
    }
}
