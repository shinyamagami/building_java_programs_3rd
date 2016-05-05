import java.util.*;

public class Consecutive{
    public static boolean consecutive(int x, int y,int z){

        if ((y - 1 == x || y - 1 == z || y + 1 == x || y + 1 == z) && (x + y + z) % 3 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter integers and seperate them with a space: ");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        boolean result = consecutive(x, y, z);
        System.out.println(result);
    }
}
