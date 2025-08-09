package com.varun.config;

import com.varun.modules.Alien;
import com.varun.modules.Computer;
import com.varun.modules.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigAutowireExample {

    @Bean
    public Alien alien(Computer com) {
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

    @Bean
    public Desktop desk() {
        return new Desktop();
    }

}
