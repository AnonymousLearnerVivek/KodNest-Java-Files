import java.util.Scanner;

public class _21JavaWhileLoops {
    public static void main(String[] args){

        // while loop = Repeat some code forever
        //              while some condition remains true


//        Scanner obj = new Scanner(System.in);
//
//        String name = "";
//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = obj.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//        obj.close();



        Scanner obj = new Scanner(System.in);
        // EXAMPLE 2
        // playing game - loop will repeat until we quite game by pressing Q

//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quite: ");
//            response = obj.next().toUpperCase();
//        }
//
//        System.out.println("You have quite the game");

        int age  = 0;
        System.out.print("Enter your age: ");
        age = obj.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = obj.nextInt();
        }

        System.out.println("You are " +  age + " years old");

        obj.close();
    }
}
