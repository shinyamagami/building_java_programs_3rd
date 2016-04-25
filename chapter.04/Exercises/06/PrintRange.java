import java.util.*; // for Scanner

public class PrintRange{
    public static void printRange(int a, int b){
        if (a >= b){
            for (int i = 0; i <= a - b; i++){
                System.out.print(a - i + " ");
            }
        } else if (a <= b){
            for (int i = 0; i <= b - a; i++){
                System.out.print(a + i + " ");
            }
        } else {
            System.out.print(a);
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter two integers and seperate them with a" +
                        " space: ");
        int a = console.nextInt();
        int b = console.nextInt();
        printRange(a, b);
    }
}
