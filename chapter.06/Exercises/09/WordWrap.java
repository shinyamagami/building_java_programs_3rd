gave up

/*
import java.util.*;
import java.io.*;

public class WordWrap{
    public static void wordWrap(Scanner input){
        String result = "";
        int count = 0;
        while (input.hasNext()){
            String p = input.nextLine();
            int l = p.length();
            for (int i = 0; (i + 1) * 60 <= l; i++){
                String nl = p.substring(i * 60, (i + 1) * 60 - 1);
                result += nl + "\n";
                count++;
            result += p.substring(count * 60, l - 1);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("einstein.txt"));
        wordWrap(input);
    }
}
*/
