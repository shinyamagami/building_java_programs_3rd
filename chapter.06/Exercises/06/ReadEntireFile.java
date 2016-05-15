import java.util.*;
import java.io.*;

public class ReadEntireFile{
    public static String readEntireFile(Scanner input){
        String output = "";
        while(input.hasNext()){
            String sentence = input.next();
            output += sentence + " ";
        }
        System.out.println(output);
        return output;
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("lorem.txt"));
        String output = readEntireFile(input);
    }
}
