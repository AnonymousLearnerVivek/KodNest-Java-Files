import java.util.Scanner;

public class _18EnhancedSwitches {
    public static void main(String[] args){
        
        // Enhanced switch = A replacement to many else if statements
        //                  (Java14 feature)

        Scanner obj = new Scanner(System.in);

        String day;
        System.out.print("Enter the day of the week: ");
        day = obj.nextLine();

//        switch (day){
//            case "Monday" -> System.out.println("It is a weekday😖"); // (->) = its arrow symbol it means "if this then do this "
//            case "Tuesday" -> System.out.println("It is a weekday😖");
//            case "Wednesday" -> System.out.println("It is a weekday😖");
//            case "Thursday" -> System.out.println("It is a weekday😖");
//            case "Friday" -> System.out.println("It is a weekday😖");
//            case "Saturday" -> System.out.println("It is a weekend😁😜");
//            case "Sunday" -> System.out.println("It is a weekend😁😜");
//            default -> System.out.println(day + " is not a day");
//        }

        // Enhanced switches
        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday😖");
            case "Saturday", "Sunday" ->
                    System.out.println("It is a weekend😁😜");
            default -> System.out.println(day + " is not a day");
        }
    }
}
