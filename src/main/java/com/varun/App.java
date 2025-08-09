package com.varun;

import com.varun.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        new App().javaBasedConfig(context);
        new App().beanNameExample(context);
    }

    public void beanNameExample(ApplicationContext context) {
        Laptop l1 = context.getBean("my_laptop", Laptop.class);
        l1.compile();
    }

    public void javaBasedConfig(ApplicationContext context) {
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
    }
}
