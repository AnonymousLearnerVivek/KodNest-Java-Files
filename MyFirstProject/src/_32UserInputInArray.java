import java.util.Scanner;

public class _32UserInputInArray {
    public static void main(String[] args){



//        String[] foods = new String[3]; // here we're creating an empty array that has space for 3 elements
//        foods[0] = "pizza";
//        foods[1] = "taco";
//        foods[2] = "Hamburger";
//        System.out.println(foods.length);
//
//        for(String food : foods){
//            System.out.println(food);
//        }

        // lets take an user input elements

        Scanner obj = new Scanner(System.in);

//        String[] foods = new String[3];

        String[] foods;
        int size;

        System.out.print("What No. of food do you want?: ");
        size = obj.nextInt();
        obj.nextLine(); // clearing the new line input buffer

        foods = new String[size];

        for( int i = 0; i < foods.length; i++){
            System.out.printf("Enter a %d food: ", (i + 1));
            foods[i] = obj.nextLine();
        }

        for(String food : foods){
            System.out.print(food + " ");
        }

        obj.close();
    }
}
