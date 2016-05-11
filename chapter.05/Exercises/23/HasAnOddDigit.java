import java.util.*;

public class HasAnOddDigit{
    public static final int a = 2;

    public static boolean hasAnOddDigit(String x){
        boolean result = false;
        int l = x.length();
        for (int i = 0; i <= l - 1; i++){
            int n = x.charAt(i);
            if ((n + a) % 2 != 0){
                result = true;    
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        String x = console.next();
        boolean result = hasAnOddDigit(x);
        System.out.println(result);
    }
}
