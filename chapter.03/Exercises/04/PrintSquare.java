public class PrintSquare{
    public static void printSquare(int min, int max){

        for (int i = 0; i <= 4; i++){
            for (int j = min + i; j <= max; j++){
                System.out.print(j);
            }
            for (int k = 0; k <= i - 1; k++){
                System.out.print(min + k);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printSquare(3, 7);
        System.out.println();
    }
}
