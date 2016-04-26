import java.util.*;

public class PrintGPA{
    public static void printGPA(Scanner console){
        System.out.print("Enter a student record: ");
        String name = console.next();
        int number = console.nextInt();
        double sum = 0;
        for (int i = 1; i <= number; i++){
            int score = console.nextInt();
            sum += score;
        }
        double average = sum / number;
        System.out.println(name + "\'s grade is " + average);

    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        printGPA(console);
    }
}
