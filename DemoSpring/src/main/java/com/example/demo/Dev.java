package com.example.demo;

public class Dev {

    // private Laptop laptop;

    // This is for autowiring in Spring interface.

    private Computer com;

    private int age;

    public Dev() {
        System.out.println("Dev Constructor called");
    }

    // using parametrized constructor and spring constructor-arg we are creating
    // container with age variable value equal to 10;
    public Dev(int age) {
        this.age = age;
        System.out.println("Dev 1 Container called");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public Laptop getLaptop() {
    // return laptop;
    // }

    // public void setLaptop(Laptop laptop) {
    // this.laptop = laptop;
    // }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Computer getCom() {
        return com;
    }

    public void build() {
        System.out.println("Working on awesome project");
        // laptop.compile();
        com.compile();

    }

}
