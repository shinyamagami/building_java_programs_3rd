import java.util.*;

public class PrintPalindrom{
    public static void printPalindrom(Scanner console){
        System.out.print("Please enter one or more words: ");
        String word = console.next().toLowerCase();
        String palindrom = "";
//        int l = word.length();
        for (int i = 0; i < word.length(); i++){
            palindrom = word.charAt(i) + palindrom;
        }
        if (word.equals(palindrom)){
        }
        System.out.println(palindrom);
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        printPalindrom(console);
    }
}
