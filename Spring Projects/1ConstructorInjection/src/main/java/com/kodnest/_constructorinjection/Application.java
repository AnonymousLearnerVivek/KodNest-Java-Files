package com.kodnest._constructorinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(Application.class, args);

        Developer developer = ac.getBean(Developer.class);
        developer.develop();
    }

}
