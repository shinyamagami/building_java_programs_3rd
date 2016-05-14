import java.io.*;
import java.util.*;

public class CointCoins{
    public static void cointCoins(Scanner input){
        double sum = 0;
        while(input.hasNext()){
            int number = input.nextInt();
            String type = input.next().toLowerCase();
            System.out.println(number + " " + type);
            if (type.equals("pennies")){
                sum = sum + number * 0.01;
            } else if (type.equals("nickels")){
                sum = sum + number * 0.05;
            } else if (type.equals("dimes")){
                sum = sum + number * 0.10;
            } else if (type.equals("quarters")){
                sum = sum + number * 0.25;
            }
        }
        System.out.printf("Total money: $%.2f",sum);
        System.out.println();
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("coins.txt"));
        cointCoins(input);
    }
}
