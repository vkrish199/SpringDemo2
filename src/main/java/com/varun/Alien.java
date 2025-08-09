package com.varun;

public class Alien {

    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object created");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding...");
        com.compile();
    }

}
