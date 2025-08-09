package com.varun.config;

import com.varun.Desktop;
import com.varun.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Desktop desk() {
        return new Desktop();
    }

    @Bean(name = "my_laptop")
    //multiple names can be specified like @Bean(name = {"my_laptop","custom_laptop"})
    public Laptop lap() {
        return new Laptop();
    }

}
