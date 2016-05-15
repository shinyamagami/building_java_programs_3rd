import java.util.*;
import java.io.*;

public class FlipLines{
    public static String flipLines(Scanner input){
        String output = "";
        while(input.hasNextLine()){
            String sentence = input.nextLine();
            if (input.hasNextLine()){
                String sentence2 = input.nextLine();
                output = output + "\n" + sentence2 + "\n" + sentence;
            } else {
                output += "\n" + sentence;
            }
        }
        System.out.println(output);
        return output;
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("lines.txt"));
        String output = flipLines(input);
    }
}
