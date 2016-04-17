public class LargerAbsVal{
    public static int largerAbsVal(int a, int b, int c){
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        int d = Math.max(a, b);
        return Math.max(c, d);
    }
    public static void main(String[] args){
        System.out.println(largerAbsVal(7, -2, -11));
        System.out.println(largerAbsVal(-4, 5, 2));
    }
}
