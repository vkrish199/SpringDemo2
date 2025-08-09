package com.varun.modules;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("desk")
@Primary
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop Object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }

}
