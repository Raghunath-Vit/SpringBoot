package com.example.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // @Autowired
    // Laptop laptop; // Field Injection

    // Constructor Injection
    // private Laptop laptop;
    // public Dev(Laptop laptop) {
    // this.laptop = laptop;
    // }

    // Now creating confusion and using @Primary to solve the confusion to which
    // class object to be connect in case of interface being extended by Laptop and
    // Desktop Class file.

    @Autowired
    // Other way to solve confusion using Qualifier. It accepts the refernce or the
    // className in lowerCase. But it is the reference.
    @Qualifier("laptop")
    private Computer comp;

    public void build() {
        // laptop.compile();
        comp.compile();
        System.out.println("Developers are building something awesome");
    }
}
