public class DollarFigure{
    public static final int height = 7; // This is theh golbal constant for 22
                                        // and 23.

    public static void main(String[] args){
        for (int i = 1; i <= height; i++){
            for (int j = 0; j <= 2 * i - 3; j++){
                System.out.print("*");
            }
            for (int k = 0; k <= height - i; k++){
                System.out.print("$");
            }
            for (int l = 0; l <= height * 2 - 2 * i + 1; l++){
                System.out.print("*");
            }
            for (int m = 0; m <= height - i; m++){
                System.out.print("$");
            }
            for (int n = 0; n <= 2 * i - 3; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
