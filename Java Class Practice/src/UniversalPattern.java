import java.util.Scanner;

public class UniversalPattern {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                if(j == 0 || i == 0 || j == n-1 || i == n-1 || i == (n-1)/2 ||  j == (n-1)/2 || i == j|| i+j == n-1 || i+j == (n-1)/2 || i-j == (n-1)/2 || j-i == (n-1)/2 || i+j == (n-1) + (n-1)/2 ){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        // M pattern
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                if (j == 0 || j == n - 1 || (i == j && i <= (n-1) / 2)  || (i+j == (n-1) && i <= (n-1)/2 & j >= (n-1)/2)) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // K pattern
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                if(j == 0 || (i == (n-1) / 2 && j <= (n-1)/2) || (i+j == (n-1) && i<= (n-1)/2) || (i == j && i>= (n-1)/2) ){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // S pattern without curves
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                if(i == 0 || i == (n-1)/2 || i == n-1 || (j == 0 && i <= (n-1)/2) || (j == n-1 && i >= (n-1)/2)){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // S pattern with curves

        // Printing VIVEK pattern

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i == j && j <= (n-1)/2) || (i+j == (n-1) && j >= (n-1)/2)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for(int j = 0; j < n; j++){
                if(i == 0 || i == (n-1)/2 || (j == (n-1)/2) && i <=(n-1)/2){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            for(int j = 0; j < n; j++){
                if((i == j && j <= (n-1)/2) || (i+j == (n-1) && j >= (n-1)/2)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for(int j = 0; j < n; j++){
                if(i == 0 || i == (n-1)/2 || i == (n-1)/4 || (j == 0 && i <= (n-1)/2 )){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            for(int j = 0; j < n; j++){
                if((j == 0 && i <= (n-1)/2)  || (i == (n-1)/4 && j <= (n-1)/4) || (i+j == (n-1) && j >= (n-1)/4) || i == j && i <= (n-1)/2){
                    System.out.print("* ");
                } else  {
                    System.out.print("  ");
                }
            }


            System.out.println();
        }

    }
}
