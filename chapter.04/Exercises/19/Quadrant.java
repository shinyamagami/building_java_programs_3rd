import java.util.*;

public class Quadrant{
    public static int quadrant(double x, double y){
        int area = 0;
        if (x == 0 || y == 0){
            area = 0;
            return area;
        }
        if (x > 0){
            if (y > 0){
                area = 1;
                return area;
            }
            area = 4;
            return area;
        }
        if ( y > 0){
                area = 2;
                return area;
            }
        area = 3;
        return area;

    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number for x: ");
        double x = console.nextDouble();
        System.out.print("Enter a number for y: ");
        double y = console.nextDouble();
        int area = quadrant(x, y);
        System.out.println("The point you enter is in Quadrant " + area);
    }
}
