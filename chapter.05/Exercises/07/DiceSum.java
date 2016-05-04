import java.util.*;

public class DiceSum{
    public static void diceSum(Scanner console){

        System.out.print("Desired dice sum: ");
        int sum = console.nextInt();
        int addition;
        do{
            Random r = new Random();
            int x = r.nextInt(6) + 1;
            int y = r.nextInt(6) + 1;
            addition = x + y;
            System.out.println(x + " and " + y + " = " + addition);
        } while (addition != sum);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        diceSum(console);
    }
}
