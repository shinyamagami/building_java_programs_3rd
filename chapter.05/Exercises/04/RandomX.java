import java.util.*;

public class RandomX{
    public static void randomX(){
        Random r = new Random();
        int result = 0;
        while (result < 16){
            result = r.nextInt(16) + 5;
            for (int i = 0; i < result; i++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        randomX();
    }
}
