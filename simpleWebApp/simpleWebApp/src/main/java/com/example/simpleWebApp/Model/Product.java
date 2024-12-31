package com.example.simpleWebApp.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {

    private int prodId;
    private String prodName;
    private int price;

    // i am using lombok from mvnrep which automatically generates the getter setter
    // method and hashCode etc..
}
