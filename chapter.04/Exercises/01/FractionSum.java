import java.util.*; // for Scanner

public class FractionSum{
    public static double fractionSum(int n){
        double sum = 0;
        for (double i = 1; i <= n; i++){
            sum = sum + 1 / i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a nonnegative integer: ");
        int integer = console.nextInt();
        double sum = fractionSum(integer);
        System.out.println(sum);
    }
}
