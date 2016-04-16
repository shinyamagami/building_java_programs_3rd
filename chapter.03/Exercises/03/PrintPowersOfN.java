public class PrintPowersOfN{
    public static void printPowersOfN(int base, int exponent){
        System.out.print("1 ");
        int result = 1;
        for (int i = 1; i <= exponent; i++){
            result = result * base;
            System.out.print(result + " ");
        }
    }
    public static void main(String[] args){
        printPowersOfN(4,3);
        System.out.println();
        printPowersOfN(5,6);
        System.out.println();
        printPowersOfN(-2,8);
        System.out.println();
    }
}
