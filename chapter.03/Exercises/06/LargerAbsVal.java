public class LargerAbsVal{
    public static int largerAbsVal(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        return Math.max(a, b);
    }
    public static void main(String[] args){
        System.out.println(largerAbsVal(11, 2));
        System.out.println(largerAbsVal(4, -5));
    }
}
