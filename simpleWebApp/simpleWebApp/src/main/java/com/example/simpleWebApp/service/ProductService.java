package com.example.simpleWebApp.service;

import com.example.simpleWebApp.Model.Product;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "iPhone", 50000),
            new Product(102, "Lenovo ThinkPAd", 40000),
            new Product(103, "Logistic Mouse", 1500));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
    }
}
