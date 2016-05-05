import java.util.*;

public class PrintAverage{
    public static void printAverage(Scanner console){
        int sentinel = 0;
        int sum = 0;
        int count = 0;
        int x = 0;
        while (x >= sentinel){
            System.out.print("Type a number: ");
            x = console.nextInt();
            if (x >= 0){
                sum += x;
                count++;
            } else {
                sum += 0;
            }
        }
        double average = sum / count;
        System.out.println("Average was " + average);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        printAverage(console);
    }
}
