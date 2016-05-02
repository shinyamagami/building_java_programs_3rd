import java.util.*;

public class ShowTwos{
    public static void showTwos(int number){

        System.out.print(number + " = ");
        while (number % 2 == 0){
            System.out.print("2 * ");
            number /= 2;
        }
        System.out.println(number);

    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an positive integer: ");
        int number = console.nextInt();
        showTwos(number);
    }
}
