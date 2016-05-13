import java.io.*;
import java.util.*;

public class EvenNumbers{
    public static void evenNumbers(Scanner console)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("integers.txt"));
        int count = 0;
        int counte = 0;
        int sum = 0;
        while (input.hasNext()){
            count++;
            int number = input.nextInt();
            sum += number;
            if (number == 0 || number % 2 == 0){
                counte++;
            }
        }
        System.out.println(count + " " + counte);
        System.out.println(count + " numbers, sum = " + sum);
        double ratio = (float)counte / count;
        System.out.println(counte + " evens (" + ratio + "%)");
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        evenNumbers(console);
    }
}
