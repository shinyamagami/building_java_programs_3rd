public class Pay{
    public static double pay(double s, int h){
        double p = s * Math.min(h, 8) + 1.5 * s * (Math.max(8, h) - 8);
        return p;
    }
    public static void main(String[] args){
        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
    }
}
