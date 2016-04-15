public class Window{
    public static final int width = 2;
    public static final int height = 5;

    public static void main(String[] args){
        drawLine();
        drawBar();
        drawLine();
        drawBar();
        drawLine();
    }
    public static void drawLine(){
        for (int i = 1; i <= 2; i++){
            System.out.print("+");
            for (int j = 1; j <= 1; j++){
                for (int k = 1; k <= width; k++){
                    System.out.print("=");
                }
            }
        }
        System.out.print("+");
        System.out.println();
    }
    public static void drawBar(){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= 2; j++){
                System.out.print("|");
                for (int k = 1; k <= width; k++){
                    System.out.print(" ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
