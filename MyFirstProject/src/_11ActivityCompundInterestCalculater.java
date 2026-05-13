import java.util.Scanner;

public class _11ActivityCompundInterestCalculater {
    public static void main(String[] args){

        // Compound interest calculator

        Scanner obj = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = obj.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = obj.nextDouble() / 100;

        System.out.print("Enter the Number of times compounded per year: ");
        timesCompounded = obj.nextInt();

        System.out.print(" Enter the #number of years: ");
        years = obj.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("The amount after " + years + " years is: $" + amount);

        System.out.println(" ");

        System.out.printf("The amount after %d years is: $%.2f", years, amount); // also print the output with printf statement
        obj.close();
    }
}
