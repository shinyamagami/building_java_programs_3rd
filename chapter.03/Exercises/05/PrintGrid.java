public class PrintGrid{
    public static void printGrid(int r, int c){
        for (int i = 1; i <= r; i++){
            for (int j = 0; j <= c - 1; j++){
                System.out.print(i + 4 * j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printGrid(4, 6);
    }
}
