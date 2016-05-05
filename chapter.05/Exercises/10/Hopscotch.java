import java.util.*;

public class Hopscotch{
    public static void hopscotch(int x){
        int step = x * 3 + 1;
        String space = " ";
        if (x < 0){
            System.out.println();
        } else if (x == 0){
            System.out.println(space + space + "1");
        } else {
            System.out.println(space + space + "1");
            for (int i = 1; i <= x; i++){
                    System.out.println((i * 3) - 1 + space + space + space + (i * 3));
                    System.out.println(space + space + (i * 3 + 1));
            }
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int x = console.nextInt();
        hopscotch(x);
    }
}
