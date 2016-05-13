import java.io.*;
import java.util.*;

public class BoyGirl{
    public static void boyGirl(Scanner console)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("names.txt"));
        int count = 2;
        int counta = 0;
        int countb = 0;
        int suma = 0;
        int sumb = 0;
        boolean next;
        do{
            next = input.hasNext();
            if (count % 2 == 0){
                String namea = input.next();
                suma += input.nextInt();
                counta++;
            } else {
                String nameb = input.next();
                sumb += input.nextInt();
                countb++;
            }
            count++;
        } while (next == true);
        System.out.println(counta + "boys, " + countb + " girls");
        System.out.println("Difference between boys' and girls' sums: " +
                            Math.abs(suma - sumb));
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
    }
}
