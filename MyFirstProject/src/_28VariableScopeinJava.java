

public class _28VariableScopeinJava {

    static int x = 3; // CLASS VARIABLE

    public static void main(String[] args){

        // variable scope = where a variable can be accessed
        // i.  Local - variable declared inside a method has a local scope &
        //             CANNOT be accessed from outside the method

        // ii. Class - class variable declared outside the main method, but inside the class
        //            can be accessed from anywhere

        int x = 1; // LOCAL
        System.out.println(x);

        doSomething();
        // o/p will be 1 and 2 even though there's a 3rd variable X = 3 within the class scope
        // Java likes to use any local variables first if they share the same name as any class variables
    }
    static void doSomething(){
        int x = 2;
        System.out.println(x);
    }
}
