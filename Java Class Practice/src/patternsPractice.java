import java.util.Scanner;

public class patternsPractice {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();

        /*
            Pattern 1 - Hollow right angle triangle
            *
            **
            *_*
            *__*
            *****
        */

//        for(int i = 1; i <= number; i++){
//            for(int j = 1; j<=i; j++){
//                if(j == 1 || j == i || i == number){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        /*
            Pattern 2 - Hollow equilateral triangle
            ____*
            ___*_*
            --*___*
            _*_____*
            *_*_*_*_*
        */
//        for(int i = 1; i <= number; i++){
//            for(int j = 0; j < number - i; j++){
//                System.out.print(" ");
//            }
//
//            for(int j = 1; j <= 2*i-1; j++){
//                if(j == 1 || j == 2*i-1){
//                    System.out.print("*");
//                }
//                else if(i == number){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        // OR
//        for(int i = 1; i <= number; i++){
//            for(int j = 1; j <= number - i; j++){
//                System.out.print(" ");
//            }
//
//            for(int j = 1; j <= i; j++){
//                if(j == 1 || j == i || i == number ){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


    }
}
