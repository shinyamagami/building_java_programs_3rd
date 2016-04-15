public class SlashFigure2{
    public static void main(String[] args){
        int a = 4;
        for (int i = 1; i <= a; i++){
            for (int j = (i - 1) * 2; j <= (i - 1) * 2; j += 2){
                for (int k = 1; k <= j; k += 1){
                    System.out.print("\\");
                }
            }
            for (int l = 14 - 4 * (i -1); l >= 14 - 4 * (i - 1); l -= 4){
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
        System.out.println();
        int b = 8;
        for (int i = 1; i <= b; i++){
            for (int j = (i - 1) * 2; j <= (i - 1) * 2; j += 2){
                for (int k = 1; k <= j; k += 1){
                    System.out.print("\\");
                }
            }
            for (int l = 30 - 4 * (i -1); l >= 30 - 4 * (i - 1); l -= 4){
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
