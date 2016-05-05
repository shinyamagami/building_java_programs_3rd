import java.util.*;

public class HasMidpoint{
    public static boolean hasMidpoint(int x, int y, int z){
        if (x == y && y == z){
            return true;
        } else if ((x + y) / 2 == z || (x + z) / 2 == y || (y + z) / 2 == x){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Input three integers and separate them with a space: ");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        boolean result = hasMidpoint(x, y, z);
        System.out.println(result);
    }
}
