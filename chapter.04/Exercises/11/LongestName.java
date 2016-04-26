import java.util.*;

public class LongestName{
    public static void longestName(Scanner console, int n){
        String longest = "";
        for (int i = 1; i <= n; i++){
            System.out.print("name #" + i + "? ");
            String name = console.next();
            int a = longest.length();
            int b = name.length();
            if (a < b){
                longest = name;
            } else if (a == b){
                longest += name;
            } else {
            }
        }
        longest = longest.toLowerCase();
        longest = Character.toUpperCase(longest.charAt(0)) + longest.substring(1);
        System.out.println(longest + "\'s name is longest");
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many names do you want to enter?: ");
        int n = console.nextInt();
        longestName(console, n);

    }
}
