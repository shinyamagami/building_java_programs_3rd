import java.util.*;

public class IsAllVowels{
    public static boolean isAllVowels(String word, boolean result){

        int l = word.length();

            for (int i = 0; i <= l - 1; i++){
                char c = word.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                    result = false;
                }
            }

        return result;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String word = console.nextLine();
        word = word.toLowerCase();
        boolean result = true;
        if (word != ""){
            result = isAllVowels(word, result);
        }
        System.out.println(result);
    }
}
