package com.example.simpleWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// If we write controller then we have to write @ResponseBody, otherwise Spring thinks that "Welcome to SpringWebProject" and "About Page, I learn" are class Files and look for the Java class with these file Name. But if we write @ResponseBody it will treat that method as the response to be send when mapped to the url. and if you dont want to write @ResponseBody that replace @Controller with @RestController.
// @Controller
// public class HomeController {
//     @RequestMapping("/")
//     @ResponseBody
//     public String greet() {
//         return "Welcome to SpringWebProject";
//     }

//     @RequestMapping("/about")
//     @ResponseBody
//     public String about() {
//         return "About Page, I learn";
//     }

// }

@RestController
public class HomeController {
    // The below code will check or mapped with the url.
    @RequestMapping("/")
    public String greet() {
        return "Welcome to SpringWebProject";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Page, I learn";
    }

}
