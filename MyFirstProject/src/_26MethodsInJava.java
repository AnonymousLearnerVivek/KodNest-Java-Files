public class _26MethodsInJava {
    public static void main(String[] args){

        // method = a block of reusable code  that is executed when called ()
        // i) methods are not familiar with variables which are inside of other methods

//        String name = "Bro code";
//        int age = 25;
//

//        happyBirthday();
//        happyBirthday(name, age);

//        double result = square(3);
//        System.out.println(result);
//        // Or
//        System.out.println(square(3));
//        System.out.println(cube(5));

//        String name = getFullName("Vivek", "Surana");
//        System.out.println(name);

//        int age = 12;
//
//        if(ageCheck(age)){
//            System.out.println("You may sign up!");
//        }else{
//            System.out.println("You must be 18+ to sign up");
//        }

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
//        System.out.println("Happy Birthday dear you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
//        System.out.println("You are X years old!");
        System.out.printf("You are %d years old!\n", age);

        System.out.println("Happy Birthday to you!\n");
    }

    // Let's Create a method to square a number then return the result

    static double square(double number){
        return number * number;
    }

    // Let's create a method to cube
    static double cube(double number){
        return number * number * number;
    }

    // Let's create a method to return a full name after being given a first and last name

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    // Let's create a method to check users age

    static boolean ageCheck(int age){
        return (age >= 18) ? true : false;
    }
}
