public class Area{
    public static double area(double r){
        double a = r * r * Math.PI;
        return a;
    }

    public static void main(String[] args){
        System.out.println(area(2.0));
    }
}
