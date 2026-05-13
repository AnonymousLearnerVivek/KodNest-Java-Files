import java.util.Random;
import java.util.Scanner;

public class _38ActivityJavaSlotMachine {
    public static void main(String[] args){

        // JAVA SLOT MACHINE

        // DECLARE VARIABLES
        // DISPLAY WELCOME MESSAGE
        // PLAY IF BALANCE > 0
        // ENTER BET AMOUNT
        //    VERIFY IF BET > BALANCE
        //    VERIFY IF BET > 0
        //    SUBTRACT BET FROM BALANCE
        // SPIN ROW
        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE

        Scanner obj = new Scanner(System.in);

        // DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] row;  // going to contain our symbols our emojis
        String playAgain;


        // DISPLAY WELCOME MESSAGE
        System.out.println("*****************************");
        System.out.println("Welcome to Java Slots Machine");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*****************************");

        // PLAY IF BALANCE > 0
        while(balance > 0){
            System.out.println("Current balance: $" + balance);

            // ENTER BET AMOUNT
            System.out.print("Place your bet amount: ");
            bet = obj.nextInt();
            obj.nextLine();

            //    VERIFY IF BET > BALANCE
            //    VERIFY IF BET > 0
            //    SUBTRACT BET FROM BALANCE
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bat must be greater than 0");
                continue;
            }
            else {
                balance -= bet;
                System.out.println("$" + balance);
            }


            // SPIN ROW
            System.out.println("Spinning...");
            row = spinRow();


            // PRINT ROW
            printRow(row);

            // GET PAYOUT

            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
           }
            else {
                 System.out.println("Sorry you lost this round");
           }

            // ASK TO PLAY AGAIN

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = obj.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
           }

        }
        // DISPLAY EXIT MESSAGE

        System.out.println("GAME OVER! Your final balance is $" + balance);

        obj.close();
    }

    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
              case "🍒" -> bet * 3;
              case "🍉" -> bet * 4;
              case "🍋" -> bet * 5;
              case "🔔" -> bet * 10;
              case "⭐" -> bet * 20;
              default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
