import java.util.*;

public class ThreeHeads{
    public static void threeHeads(){
        Random r = new Random();
        int max = 3;
        int count = 0;
        do{
            int c = r.nextInt(2);
            if(c == 1){
                System.out.print("T ");
                count++;
            } else {
                System.out.print("H ");
                count = 0;
            }
        } while (count < max);
        System.out.println();
        System.out.println("Three heads in a row!");
    }
    public static void main(String[] args){
        threeHeads();
    }
}
