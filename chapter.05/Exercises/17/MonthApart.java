import java.util.*;

public class MonthApart{
    public static boolean monthApart(int m1, int d1, int m2, int d2){
        if (m1 != m2){
            if (m1 < m2){
                if (d1 < d2){
                    return true;
                } else {
                    return false;
                }
            } else {
                if (d1 > d2){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter four positive integers for a month, " +
        "a day, a month, and a day, and separate them with a space: ");
        int m1 = console.nextInt();
        int d1 = console.nextInt();
        int m2 = console.nextInt();
        int d2 = console.nextInt();
        boolean result = monthApart(m1, d1, m2, d2);
        System.out.println(result);
    }
}
