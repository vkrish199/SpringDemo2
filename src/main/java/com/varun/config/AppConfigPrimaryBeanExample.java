package com.varun.config;

import com.varun.modules.Alien;
import com.varun.modules.Computer;
import com.varun.modules.Desktop;
import com.varun.modules.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfigPrimaryBeanExample {

    @Bean
    public Alien alien(Computer com) {
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

    @Bean
    @Primary
    public Desktop desk() {
        return new Desktop();
    }

    @Bean
    public Laptop lap() {
        return new Laptop();
    }

}
