import java.util.*;

public class MakeGuesses{
    public static void makeGuesses(Scanner console, int number){
        int time = 0;
        int x;
        do{
            System.out.print("Guess an integer between 0 and 50 inclusive: ");
            x = console.nextInt();
            time++;
        } while (x != number);
        System.out.println("Total guesses is " + time);
    }
    public static void main(String[] args){
        Random r = new Random();
        int number = r.nextInt(50) + 1;
        Scanner console = new Scanner(System.in);
        makeGuesses(console, number);
    }
}
