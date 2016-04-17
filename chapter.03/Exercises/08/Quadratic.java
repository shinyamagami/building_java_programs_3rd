public class Quadratic{
    public static void quadratic(int a, int b, int c){
        double root = Math.sqrt(b * b - 4 * a *c);
        double d = (-b + root) / 2 * a;
        double e = (-b - root) / 2 * a;
        System.out.println("x = " + d);
        System.out.println("x = " + e);

    }
    public static void main(String[] args){
        quadratic(1, -7, 12);
        System.out.println();
        quadratic(1, 3, 2);
        System.out.println();
    }
}
