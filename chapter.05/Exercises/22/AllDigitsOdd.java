import java.util.*;

public class AllDigitsOdd{
    public static final int a = 2;
    public static boolean allDigitsOdd(String x){
        int l = x.length();
        int n;
        boolean result = true;
        for (int i = 0; i <= l - 1; i++){
            n = x.charAt(i);
            if ((n + a) % 2 == 0){
                result = false;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        String x = console.next();
        boolean result = allDigitsOdd(x);
        System.out.println(result);
    }
}
