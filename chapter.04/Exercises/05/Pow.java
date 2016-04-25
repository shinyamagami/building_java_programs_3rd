import java.util.*; // for Scanner

public class Pow{
    public static int pow(int base, int power){
        int a = 1;
        for (int i = 1; i <= power; i++){
            a *= base;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a positive integer for the base: ");
        int base = console.nextInt();
        System.out.print("Please enter a positive integer for the power: ");
        int power = console.nextInt();
        int result = pow(base, power);
        System.out.println("The answer is " + result);
    }
}
