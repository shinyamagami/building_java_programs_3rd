public class PrintReverse{
    public static void printReverse(String s){
        int n = s.length(); // n for the number of the length of the string
        for (int i = n - 1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[] args){
        printReverse("hello there!");
    }
}
