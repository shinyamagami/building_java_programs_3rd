import java.util.*;

public class FirstDigit{
    public static int firstDigit(int x){
        x = Math.abs(x);
        int reminder;
        do{
            reminder = x % 10;
            x /= 10;
        } while (x < 10);
        return reminder;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int x = console.nextInt();
        int result = firstDigit(x);
        System.out.println(result);
    }
}
