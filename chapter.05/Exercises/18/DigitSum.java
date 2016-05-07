import java.util.*;

public class DigitSum{
    public static int digitSum(int x){
        x = Math.abs(x);
        int reminder;
        int sum = 0;
        do{
            reminder = x % 10;
            sum += reminder;
            x /= 10;
        }
        while (x != 0);
        return sum;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int x = console.nextInt();
        int result = digitSum(x);
        System.out.println(result);
    }
}
