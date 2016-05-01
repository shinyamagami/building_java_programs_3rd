import java.util.*; // for Scanner

public class pow2{
    public static void pow2(Scanner console){
    System.out.print("Please enter a integer: ");
    double base = console.nextDouble();
    System.out.print("Please enter a exponent: ");
    int exponent = console.nextInt();
    System.out.println(Math.pow(base, exponent));


//    public static double getInput(Scanner console){
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        pow2(console);
    }
}
