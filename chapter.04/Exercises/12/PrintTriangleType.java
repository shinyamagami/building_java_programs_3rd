import java.util.*;

public class PrintTriangleType{
    public static void printTriangleType(int a, int b, int c){
        if (a == b && b == c){
            System.out.println("equilateral");
        } else if (a != b && b != c){
            System.out.println("scalene");
        } else {
            System.out.println("isosceles");
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter three integers for the sides of a " +
                        "triangle, and seperate them with a space: ");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (a + b < c || a + c < b || b + c < a){
            throw new IllegalArgumentException("One side's length is longer " +
            "than the sum of the other two");
        }
        printTriangleType(a, b, c);
    }
}
