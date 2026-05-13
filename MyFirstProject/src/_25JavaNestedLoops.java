import java.util.Scanner;

public class _25JavaNestedLoops {
    public static void main(String[] args){

        // nested loop = A loop inside another loop
        //              Used often with matrices or DSA


//        for(int i = 1; i<=3; i++){
//            for(int j = 1; j<=9; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // Mini Project: Create a matrix of a symbol that a user is going to type-in
        // and user will set the rows and columns for this matrix

        Scanner obj = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the No. of rows: ");
        rows = obj.nextInt();

        System.out.print("Enter the No. of columns: ");
        columns = obj.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = obj.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        obj.close();
    }
}
