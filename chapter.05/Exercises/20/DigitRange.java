import java.util.*;

public class DigitRange{
    public static int digitRange(int x){
        x = Math.abs(x);
        int y;
        int a; // max
        int b; // min

        if (x / 10 == 0){
            y = 1;
            return y;
        } else {
            a = x % 10;
            x /= 10;
            b = x % 10;
            while(x != 0){
                int c = x % 10;
                x /= 10;
                if (c > a){
                    a = c;
                } else if (c < b){
                    b = c;
                }
            }
            return a - b + 1;
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int x = console.nextInt();
        int result = digitRange(x);
        System.out.println(result);
    }
}
