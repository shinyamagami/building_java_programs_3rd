import java.util.*;
import java.io.*;

public class CollapseSpaces{
    public static void collapseSpaces(Scanner input){
        String output = "";
        while(input.hasNext()){
            String word = input.next();
            output += word + " ";
        }
        System.out.println(output);
    }
    public static void main(String[] args)
    throws FileNotFoundException{
        Scanner input = new Scanner(new File("spaces.txt"));
        collapseSpaces(input);
    }
}
