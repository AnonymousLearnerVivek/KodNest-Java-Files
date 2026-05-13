public class _34VariableArguments {
    public static void main(String[] args){

        // VARARGS = allow a method to accept a varying No. of arguments
        //           making methods more flexible, no need for overloaded
        //           methods, java will pack the arguments into a array
        //           ... (ellipsis)

        //System.out.println(add(1,2,3,4,5,6, 343));
        System.out.println(average(1,2,3,3,4,5,6,78,9,23));
        System.out.println(average());
    }
    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){

        double sum = 0;
        if(numbers.length == 0){
            return 0;
        }
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
