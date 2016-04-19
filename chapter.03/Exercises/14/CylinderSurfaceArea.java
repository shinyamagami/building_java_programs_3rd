public class CylinderSurfaceArea{
    public static double cylinderSurfaceArea(double r, double h){
        double a = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
        return a;
    }
    public static void main(String[] args){
        System.out.println(cylinderSurfaceArea(3.0, 4.5));
    }
}
