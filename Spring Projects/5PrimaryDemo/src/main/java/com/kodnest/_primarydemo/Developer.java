package com.kodnest._primarydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired
    @Qualifier("desktop") // this is used when something is marked as primary but u want other object to create we use @Qualifier Annotaion
    // it means even though something is marked as primary, ALWAYS it will consider DESKTOP
    Computer comp;

    void develop() {
        comp.build();
        System.out.println("Developer has completed the work.");
    }
}
