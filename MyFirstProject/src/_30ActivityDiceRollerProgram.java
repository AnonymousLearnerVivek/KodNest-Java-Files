import java.util.Random;
import java.util.Scanner;

public class _30ActivityDiceRollerProgram {
    public static void main(String[] args){

        // JAVA DICE ROLLER PROGRAM
        Scanner obj = new Scanner(System.in);
        Random random = new Random();

        // DECLARE VARIABLES
        int numOfDice;
        int total = 0;

        // GET NO. OF DICE FROM THE USER
        System.out.print("Enter the No. of dice to roll: ");
        numOfDice = obj.nextInt();

        // CHECK IF NO. OF DICE > 0
        if(numOfDice > 0){
            // ROLL ALL THE DICE
            // GET THE TOTAL
            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);

        }else{
            System.out.println("No. of dice must be greater than 0 ");
        }

        obj.close();
    }
    // DISPLAY ASCII OF  DICE
    static void printDie(int roll){

        // """_""" = triple double quotes are used for multi-lined string
        String dice1 = """ 
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }

    }
}
