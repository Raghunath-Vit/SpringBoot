package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Note ApplicationContext is an interface. so in order to create object for
        // that we need to create the object for the class That implements
        // ApplicationContext, and one of the class that implements is
        // ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // taking object from the container of spring, and using setter and constructor
        // for accesing the variable by the spring.
        Dev obj = context.getBean(Dev.class);
        System.out.println(obj.getAge());
        obj.build();
        System.out.println("Hello World!");
    }
}
