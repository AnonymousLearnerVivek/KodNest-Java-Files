package com.Interface;

/*
    # You can also able to implement Concrete Method inside the INTERFACE and for that you have use the keyword Default
        and it will be inherited to implementing class and you are allowed to override default method in the implementing class
        Example:
                interface Demo {
                    default void display{                // default keywords are allowed only inside Interface
                        System.out.println("Hello");
                    }
                }
 */
interface Demo {
    default void disp() {
        System.out.println("Hello World");
    }
}
class Program implements Demo {
    @Override
    public void disp() {
        System.out.println("Heyy");
    }
}
public class DefaultMethodConceptinInterface {
    public static void main(String[] args) {

    }
}
