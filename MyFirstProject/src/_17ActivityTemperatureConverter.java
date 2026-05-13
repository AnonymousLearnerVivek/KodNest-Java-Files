import java.util.Scanner;

public class _17ActivityTemperatureConverter {
    public static void main(String[] args){
        // ACTIVITY

        // Temperature Converter

        Scanner obj = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = obj.nextDouble();
        obj.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = obj.nextLine().toUpperCase();

        // (condition) ? ifTrue : ifFalse

        newTemp = (unit.equals("C")) ? ((temp - 32) * 5/9) : ((temp * 9/5) + 32);

        System.out.printf("%.2f°%s",newTemp, unit);



        obj.close();
    }
}
