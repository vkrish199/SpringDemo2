package com.varun.config;

import com.varun.modules.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigScopeExample {

    @Bean
    @Scope(value = "prototype")
    public Desktop desk() {
        return new Desktop();
    }

}
