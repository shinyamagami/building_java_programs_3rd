import java.util.*; // for Scanner

public class XO{
    public static void xo(int size){
        for (int i = 0; i <= size - 1; i++){
            for (int j = 0; j <= size - 1; j++){
                if (i == j || j == size - 1 - i){
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a integer: ");
        int size = console.nextInt();
        xo(size);
    }
}
