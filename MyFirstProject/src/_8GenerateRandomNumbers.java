import java.util.Random;

public class _8GenerateRandomNumbers {
    public static void main(String[] args){

        Random obj = new Random();

        int number1;
        double number2;
        boolean isHeads;  // let say for flipping a coin
        int number3;


//        number1 = obj.nextInt(1, 101); // classifying range
//        number2 = obj.nextDouble();
//        System.out.println(number1);
//        System.out.println(number2);
//
        isHeads = obj.nextBoolean();

        if(isHeads) {
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }


//        System.out.println(isHeads);
    }
}
