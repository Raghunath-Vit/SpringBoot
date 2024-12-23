package com.example.DemoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InnerHello {

    @RequestMapping("/")
    public String greet() {
        return "Hello From Raghunath Singh, To the World";
    }
}
