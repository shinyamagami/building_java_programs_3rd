import java.util.*; // for Scanner

// remember how a method accepts a Scanner for the console as a parameter

public class SmallestLargest{
    public static void smallestLargest(Scanner console){
        System.out.print("How many numbers do you want to enter? ");
        int n = console.nextInt();
        System.out.print("Nubmer 1: ");
        int smallest = console.nextInt();
        int largest = smallest;
        for (int i = 2; i <= n; i++){
            System.out.print("Nubmer " + i + ": ");
            int number = console.nextInt();
            if (number <= smallest){
                smallest = number;
            } else if (number > smallest && number > largest){
                largest = number;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        smallestLargest(console);
    }
}
