import java.util.*;

public class SwapPairs{
    public static String getInput(Scanner console){
        System.out.print("Please enter one or several words: ");
        String words = console.nextLine();
        return words;
    }
    public static void swapPairs(String words){
        String result = "";
        int l = words.length();
        for (int i = 1; i <= l - 1; i = i + 2){
            result = result + words.charAt(i) + words.charAt(i - 1);
        }
        result = result + words.charAt(words.length() - 1);
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String words = getInput(console);
        swapPairs(words);
    }
}
