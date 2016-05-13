import java.io.*;
import java.util.*;

public class NegativeSum{
    public static boolean negativeSum(Scanner console)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("integers.txt"));
        int sum = 0;
        int count = 0;
        boolean result = false;
        while (input.hasNext() == true){
            if (sum >= 0){
                sum += input.nextInt();
                count++;
            } else {
                result = true;
            }
        }
        if (result == false){
            System.out.println("no negative sum");
        } else {
            System.out.println("sum of " + sum + "after " + count + " steps");
        }
        return result;
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        negativeSum(console);
    }
}
