package com.varun.modules;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop Object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Laptop");
    }
}
