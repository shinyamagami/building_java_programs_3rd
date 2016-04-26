import java.util.*; // for Scanner

public class EvenSumMax{
    public static void evenSumMax(Scanner console){
        System.out.print("How many integers? ");
        int number = console.nextInt();
        int sum = 0;
        int max = sum;
        for (int i = 1; i <= number; i++){
            System.out.print("Next integer? ");
            int next = console.nextInt();
            if (next % 2 == 0){
                max = Math.max(next, max);
                sum += next;
            }
        }
        System.out.println("Even sum = " + sum + ", Even max = " + max);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        evenSumMax(console);
    }
}
