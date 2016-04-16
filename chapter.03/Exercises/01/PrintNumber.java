public class PrintNumber{
    public static void printNumbers(int number){
        for (int i = 1; i <= number; i++){
            System.out.print("[" + i + "]");
        }
    }
    public static void main(String[] args){
        int a = 15;
        int b = 5;
        printNumbers(a);
        System.out.println();
        printNumbers(b);
        System.out.println();
    }
}
