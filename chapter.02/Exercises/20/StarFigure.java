public class StarFigure{
    public static final int row = 5;
    public static final int column = 32;

    public static void main(String[] args){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= 1; j++){
                for (int k = 1; k <= 20 - 4 * i; k++){
                    System.out.print("/");
                }
                for (int m = 1; m <= 8 * i - 8; m++){
                    System.out.print("*");
                }
                for (int l = 1; l <= 20 - 4 * i; l++){
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
    }
}
