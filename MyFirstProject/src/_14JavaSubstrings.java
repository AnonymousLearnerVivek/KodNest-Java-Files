import java.util.Scanner;

public class _14JavaSubstrings {
    public static void main(String[] args){

        // .substring() = A method used to extract a portion of a string
        //                .substring(Start, end)

        // EMAIL SLICER -->  Email slicer that extracts a username
        //                   and domain from an email address.


//
//        String email = "Bro123ewew@gmail.com";
//  //        String username = email.substring(0, 6);
//        String username = email.substring(0,email.indexOf("@"));
//  //        String domain = email.substring(7, 16);
//        String domain = email.substring(email.indexOf("@") + 1);
//
//        System.out.println(username);
//        System.out.println(domain);
//

        Scanner obj = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = obj.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") +  1);

            System.out.println("Your email is: " + email);
            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: "+ domain);
        }
        else {
            System.out.println("Email must be valid with @");
        }



        obj.close();
    }
}
