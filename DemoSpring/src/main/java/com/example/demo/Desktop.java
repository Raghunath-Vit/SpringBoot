package com.example.demo;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop Constructor called");
    }

    public void compile() {
        System.out.println("Compiling in Desktop");
    }
}
