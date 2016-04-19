public class Distance{
    public static double distance(double x1, double y1, double x2, double y2){
        double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return d;
    }

    public static void main(String[] args){
        System.out.println(distance(1, 0, 4, 4)); // x1, y1, x2, y2
        System.out.println(distance(10, 2, 3, 15)); // x1, y1, x2, y2
    }
}
