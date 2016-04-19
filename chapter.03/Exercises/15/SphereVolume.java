public class SphereVolume{
    public static double sphereVolume(double r){
        double v = 4 * Math.PI * r * r * r / 3;
        return v;
    }
    public static void main(String[] args){
        System.out.println(sphereVolume(2.0));
    }
}
