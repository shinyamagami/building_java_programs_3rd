public class PrintPowersOf2{
    public static void printPowersOf2(int number){
        System.out.print("1 ");
        int result = 1;
        for (int i = 1; i <= number; i++){
            result = result * 2;
            System.out.print(result + " ");
        }
    }
    public static void main(String[] args){
        int a = 3;
        int b = 10;
        printPowersOf2(3);
        System.out.println();
        printPowersOf2(10);
        System.out.println();
    }
}
