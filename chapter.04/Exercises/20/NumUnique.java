import java.util.*;

public class NumUnique{
    public static int numUnique(int a, int b, int c){
        int unique = 3;
        if (a != b && b != c && a != c){
            return unique;
        } else if (a == b && a == c){
            unique = 1;
            return unique;
        } else {
            unique = 2;
            return unique;
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter 3 integers and seperate them with a " +
                        "space: ");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int unique = numUnique(a, b, c);
        System.out.println("The number of unique integers is " + unique);
    }
}
