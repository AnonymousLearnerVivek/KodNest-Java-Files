import java.util.Scanner;
public class _7JavaIfStatement {

    public static void main(String[] args){
        // if Statement = performs a block of code if its condition is true
        Scanner obj = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = obj.nextLine();

        System.out.print("Enter your age: ");
        age = obj.nextInt();

        System.out.print("Are you a student (true/false): ");
        isStudent = obj.nextBoolean();

        // GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name! 😖😖");
        }else{
            System.out.println("Hello " + name + "! 😉");
        }

        // GROUP 2
        if(age >= 65){
            System.out.println("you are a senior");
        }
        else if(age >= 18){
            System.out.println("U are an adult!");
        }
        else if(age < 0){
            System.out.println("U havan't been born yet!");
        }
        else if(age == 0){
            System.out.println("you are a baby");
        }
        else{
            System.out.println("U are a child");
        }

        // GROUP 3
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are NOT a student");
        }

        obj.close();
    }

}
