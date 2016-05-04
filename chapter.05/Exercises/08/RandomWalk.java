import java.util.*;

public class RandomWalk{
    public static void randomWalk(){
        Random r = new Random();
        int position = 0;
        int max = 0;
        do{
            boolean step = r.nextBoolean();
            if (step == true){
                position++;
                System.out.println(position);
                if (max < position){
                    max = position;
                }
            } else {
                position--;
                System.out.println(position);
            }
        } while (position < 3 && position > -3);

        System.out.println("max position = " + max);
    }
    public static void main(String[] args){
        randomWalk();
    }
}
