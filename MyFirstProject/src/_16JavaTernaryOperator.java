
public class _16JavaTernaryOperator {
    public static void main(String[] args){

        // ternary operator (?) --> Return 1 0f 2 values if a condition is true

        // variable = (condition) ? ifTrue :  ifFalse;

//        int score = 70;
//
//        if(score >= 60){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Fail");
//        }

        // But we can also use ternary Operator instead of if-else statement

        int score = 5;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        // checking No. is even or odd
        int number = 10;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        // checking time AM or PM
        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println(timeOfDay);

        // checking tax rate according their income
        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}

