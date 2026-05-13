import java.util.Scanner;

public class _15ActivityWeightConverter {
    public static void main(String[] args){
        // WEIGHT CONVERSION PROGRAM

        // Pseudocode
        /*
        1) Declare variables
        2) welcome message
        3) prompt for user choice
        4) Option 1 convert lbs to kgs
        5) Option 2 convert kgs to lbs
        6) else print not a valid choice
        */

        Scanner obj = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = obj.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = obj.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f kgs", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = obj.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f lbs", newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }

        obj.close();
    }
}
