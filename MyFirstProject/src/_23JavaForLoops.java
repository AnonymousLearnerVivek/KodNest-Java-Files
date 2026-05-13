import java.awt.desktop.OpenURIEvent;
import java.sql.SQLOutput;
import java.util.Scanner;

public class _23JavaForLoops {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of times

        Scanner obj = new Scanner(System.in);

        // Example 1
//        System.out.println("Enter how many times you want to loop: ");
//        int max = obj.nextInt();
//
//        for(int i = 0; i < max; i++){
//            System.out.println(i);
//        }

        // MINI PROJECT: Create a program to simulate a countdown

        System.out.println("How many seconds to countdown from?: ");
        int start = obj.nextInt();

        for(int i = start; i > 0; i-- ){
            System.out.println(i);
            Thread.sleep(1000); // Future topic don't worry
        }

        System.out.println("HAPPY NEW YEAR!");

        obj.close();



    }
}
