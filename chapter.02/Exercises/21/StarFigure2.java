public class StarFigure2{
    public static final int a = 3;
    public static final int b = 6;

    public static void main(String[] args){
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= 1; j++){
                for (int k = 4 * (a - 1); k >= 4 * i - 3; k--){
                    System.out.print("/");
                }
                for (int m = 1; m <= 8 * (i -1); m++){
                    System.out.print("*");
                }
                for (int l = 4 * (a - 1); l >= 4 * i - 3; l--){
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= b; i++){
            for (int j = 1; j <= 1; j++){
                for (int k = 4 * (b - 1); k >= 4 * i - 3; k--){
                    System.out.print("/");
                }
                for (int m = 1; m <= 8 * (i -1); m++){
                    System.out.print("*");
                }
                for (int l = 4 * (b - 1); l >= 4 * i - 3; l--){
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
    }
}
