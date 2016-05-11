// give up

import java.util.*;

public class SwapDigitPairs{

/*
    public static int swapDigitPairs(int x){
        int count = 0;
        int result = 0;
        int a;
        int b;
        while (x / 10 != 0){
            count++;
            a = x % 10;
            for (int i = 0; i <= count; i++)
                power = 10
            result = result + a * 10 * ;
            x /= 10;
            b = x % 10;
            result = result + b * Math.pow(100, count - 1);

        }
        return result;
    }
*/
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int x = console.nextInt();
        int result = swapDigitPairs(x);
        System.out.print(result);
    }
}
