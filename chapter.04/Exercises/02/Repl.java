import java.util.*; // for Scanner

public class Repl{
    public static String repl(String word, int n){
        String words = "";
        if (n <= 0){
            return " ";
        } else {
            for (int i = 1; i <= n; i++){
                words += word;
            }
            return words;
        }
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = console.next();
        System.out.print("Please enter a integer: ");
        int n = console.nextInt();
        String result = repl(word, n);
        System.out.println(result);
    }
}
