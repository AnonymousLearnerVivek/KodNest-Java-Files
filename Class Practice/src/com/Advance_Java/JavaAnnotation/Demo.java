package com.Advance_Java.JavaAnnotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// User-Defined Annotation
@Retention(RetentionPolicy.SOURCE)
// Specifies that the annotation should be available at source via reflection

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
// Specifies where this annotation can be placed (e.g., METHOD, FIELD, TYPE/Class)

public @interface Demo {
    // Defines a parameter
    String demo();
}
