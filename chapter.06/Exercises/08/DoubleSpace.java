import java.util.*;
import java.io.*;

public class DoubleSpace{
    public static void doubleSpace(Scanner input, PrintStream output){
        String paragraph = input.nextLine();
        System.out.println(paragraph);
        int l = paragraph.length();
        System.out.println(l);
        String result = "";
        int count = 0;
        for (int i = 0; (i + 1) * 80 <= l; i++){
                String sentence = paragraph.substring(i * 80, 80 * (i + 1) - 1);
                result += sentence + "\n" + "\n";
                count++;
        }
        String sentence = paragraph.substring(count * 80, l);
        result += sentence + "\n";
        System.out.println(result);
        output.print(result);
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("thereforeiam.txt"));
        PrintStream output = new PrintStream(new File("newthereforeiam.txt"));
        doubleSpace(input, output);
    }
}
