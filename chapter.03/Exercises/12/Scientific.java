public class Scientific{
    public static double scientific(double b, int t){
        double n = b * Math.pow(10, t);
        return n;
    }
    public static void main(String[] args){
        System.out.println(scientific(6.23, 5));
        System.out.println(scientific(1.9, -2));
    }
}
