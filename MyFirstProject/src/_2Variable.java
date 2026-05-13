public class _2Variable {
    public static void main(String[] args){
        // ❎ variable = A reusable container for a value.
        //               A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------     ---------
        //    int           string
        //    double        array
        //    char          object
        //    boolean

        int age = 22;
        int year = 2026;
        int quantity = 1;
       // System.out.println("The year is " + year);

        double price = 199999.99;
        double gpa = 3.5;
        double temperature = -12.5;

       // System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        //System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
/*
        if(isStudent){
            System.out.println("U are a student");
        }
        else{
            System.out.println("U are NOT a student");
        }
*/
        String name = "Prime Hero";
        String food = "Pizza";
        String email = "viveksurana.021@gmail.com";
        String car = "Mustang";
        String color = "Red";

        //System.out.println("Hello " + name);
        //System.out.println("Ur fav. food is: " + food);
        //System.out.println("Ur email is " + email);

        //System.out.println("U are " + age + " years old");
        //System.out.println("Ur gpa is: " + gpa);
        //System.out.println("Ur avg. letter grade is: " + grade);

        System.out.println("Ur choice is a " + color + " " + year + " " + car);
        System.out.println("The Pirce is: " + currency + price);

        if(forSale){
            System.out.println("The " + car + " is for sale");
        }else{
            System.out.println("The " + car + " is not for sale");
        }
    }
}
