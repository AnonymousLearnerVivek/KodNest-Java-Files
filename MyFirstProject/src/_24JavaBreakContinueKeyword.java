public class _24JavaBreakContinueKeyword {
    public static void main(String[] args){

        // break = it break out of a loop (STOP)
        // continue = it skips current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){
            if(i == 5){
               // break;
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
