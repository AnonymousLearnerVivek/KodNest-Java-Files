import java.util.Random;
import java.util.Scanner;

public class _22ActivityNumberGuessingGame {
    public static void main(String[] args){

        // NUMBER GUESSING GAME
        Random random = new Random();
        Scanner obj = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;    // to make range more flexible
//        int randomNumber = random.nextInt(1, 11);
        int randomNumber = random.nextInt(min,  max + 1);

        System.out.println("Number Guessing Game");
//        System.out.println("Guess a number between 1-10: ");
        System.out.printf("Guess a number between %d-%d\n ", min, max);


        do{
            System.out.print("Enter a guess: ");
            guess = obj.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("No. of attempts: " + attempts);
            }
        }while(guess != randomNumber);



        obj.close();
    }
}
