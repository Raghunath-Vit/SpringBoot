package com.example.simpleWebApp.Model;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

// @Data
// AllArgsConstructor will create contructor for me it's a Lombok features.
// @AllArgsConstructor
@Component
public class Product {

    private int prodId;
    private String prodName;
    private int price;

    // lombok from mvnrep which automatically generates the getter setter
    // method and hashCode etc but here we stick to normal not lombok..

    // If there are multiple constructors, Spring uses(for initiating bean class
    // instance) the one annotated with @Autowired. If none are annotated, Spring
    // defaults to the no-argument constructor.
    public Product() {

    }

    // We are creating constructor to accept the data that we create using
    // Arrays.asList() method.



    // To make 
    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdID(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
