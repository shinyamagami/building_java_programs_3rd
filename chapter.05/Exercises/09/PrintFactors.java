import java.util.*;

public class PrintFactors{
    public static void printFactors(int x){

        if (x == 0 || x < 0){
            throw new IllegalArgumentException();
        } else {
            System.out.print("1 ");
            for (int i = 2; i <= x / 2; i++){
                if (x % i == 0){
                    System.out.print("and " + i + " ");
                }
            }
            System.out.println("and " + x);
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a interger: ");
        if (console.hasNextInt() == true){
            int x = console.nextInt();
            printFactors(x);
        } else {
            System.out.println("");
        }
    }
}
