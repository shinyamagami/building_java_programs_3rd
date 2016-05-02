import java.util.*;

public class GCD{
    public static void gcd(int a, int b){
        while(b != 0){
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        int gcd = Math.abs(a);
        System.out.println(gcd);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = console.nextInt();
        System.out.print("Enter an integer: ");
        int b = console.nextInt();
        gcd(a, b);
    }
}
