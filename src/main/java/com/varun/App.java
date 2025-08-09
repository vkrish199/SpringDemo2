package com.varun;

import com.varun.config.*;
import com.varun.modules.Alien;
import com.varun.modules.Desktop;
import com.varun.modules.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        new App().javaBasedConfig();
//        new App().beanNameExample();
//        new App().scopeAnnotation();
//        new App().autowireExample();
//        new App().primaryBeanExample();
//        new App().componentStereoTypeExample();
        new App().scopeAndValueAnnotation();
    }

    public void scopeAndValueAnnotation() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfigCompStereoTypeExample.class);
        Alien a = context.getBean(Alien.class);
        System.out.println(a.getAge());
        a.code();

    }

    public void componentStereoTypeExample() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfigCompStereoTypeExample.class);

        Alien a = context.getBean(Alien.class);
        System.out.println(a.getAge());
        a.code();
    }

    public void primaryBeanExample() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfigPrimaryBeanExample.class);

        Alien a = context.getBean(Alien.class);
        System.out.println(a.getAge());
        a.code();
    }

    public void autowireExample() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfigAutowireExample.class);
        Alien a = context.getBean(Alien.class);
        System.out.println(a.getAge());
        a.code();
    }

    public void scopeAnnotation() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfigScopeExample.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
        Desktop dt1 = context.getBean(Desktop.class);
        dt1.compile();
    }

    public void beanNameExample() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Laptop l1 = context.getBean("my_laptop", Laptop.class);
        l1.compile();
    }

    public void javaBasedConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
    }
}
