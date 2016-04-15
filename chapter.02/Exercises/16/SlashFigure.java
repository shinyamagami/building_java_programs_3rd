public class SlashFigure{
    public static void main(String[] args){
        for (int i = 1; i <= 6; i++){
            for (int j = (i - 1) * 2; j <= (i - 1) * 2; j += 2){
                for (int k = 1; k <= j; k += 1){
                    System.out.print("\\");
                }
            }
            for (int l = 22 - 4 * (i -1); l >= 22 - 4 * (i - 1); l -= 4){
                for (int m = 1; m <= l; m++){
                    System.out.print("!");
                }
            }
            for (int j = (i - 1) * 2; j <= (i - 1) * 2; j += 2){
                for (int k = 1; k <= j; k += 1){
                    System.out.print("/");
                }
            }
            System.out.println();
        }
    }
}
