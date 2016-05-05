import java.util.*;

public class AnglePairs{
    public static boolean anglePairs(int x, int y, int z){
        boolean result = (x + y == 180 || x + z == 180 || y + z == 180) && (x + y == 90 ||
        x + z == 90 || y + z == 90);
        if (result){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter three nonnegative integers and separate" +
                    "them with a space: ");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        boolean result = anglePairs(x, y, z);
        System.out.println(result);
    }
}
