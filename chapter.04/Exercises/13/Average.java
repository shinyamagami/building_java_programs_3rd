import java.util.*; // for Scanner

public class Average{
    public static void average(double a, double b){
        double average = (a + b) / 2;
        System.out.println(average);

    }
    public static int getInput(Scanner console){
        System.out.print("Please enter a integer: ");
        int number = console.nextInt();
        return number;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        double a = getInput(console);
        double b = getInput(console);
        average(a, b);
    }
}
