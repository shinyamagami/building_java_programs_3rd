import java.util.*;

public class Dominant{
    public static boolean dominant(int x, int y, int z){
        if (x > y + z || y > x + z || z > x + y){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter three positive integers and separate" +
                        "them with a space: ");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        boolean result = dominant(x, y, z);
        System.out.println(result);
    }
}
