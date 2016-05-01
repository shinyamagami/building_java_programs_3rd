/* give up

import java.util.*;

public class WordCount{
    public static void wordCount(String words){
        int count = 0;
        int start = 0;
        if (words.length() <= 1){
            System.out.println("I cannot read the words you input!");
        }
        for (int i = 0; i < words.length(); i++){
            if (words.indexOf(" ") == 0){
                words = words.substring(1, words.length() - 1);
            } else {
                count++;
                words = words.substring(words.indexOf(" "), words.length() - 1);
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter several words: ");
        String words = console.nextLine();
        wordCount(words);
    }
}
*/
