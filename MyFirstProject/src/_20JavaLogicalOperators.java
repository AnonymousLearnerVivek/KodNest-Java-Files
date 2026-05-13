import java.util.Scanner;

public class _20JavaLogicalOperators {
    public static void main(String[] args){

        // && = AND
        // || = OR
        // !  = NOT

        double temp = -10;
        boolean isSunny = true;

//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The weather is GOOD");
//            System.out.println("It is Sunny outside");
//        }else if(temp <=30 && temp >= 0 && !isSunny){
//            System.out.println("The weather is GOOD");
//            System.out.println("It is CLOUDY outside");
//        }else if(temp > 30 || temp < 0){
//            System.out.println("The weather is bad");
//        }

        Scanner obj = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = obj.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }



        obj.close();
    }
}
