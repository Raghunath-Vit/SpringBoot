package com.example.simpleWebApp.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleWebApp.service.ProductService;
import com.example.simpleWebApp.Model.Product;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class ProductController {

    // Here we need service object to call method from ProductService getProducts so
    // we are using @Autowired and in ProductService we use @Service which
    // internally has @Componenet which create object inside the container
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    // @PathVariable is used as we are getting int prodID from the url.
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }
}
