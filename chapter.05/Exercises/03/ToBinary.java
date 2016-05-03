import java.util.*;

public class ToBinary{
    public static void toBinary(int x){
        String binary = "";
        String on = "1";
        String off = "0";

        while (x > 0){
            if(x % 2 == 0){
                binary = off + binary;
                x /= 2;
            } else {
                binary = on + binary;
                x = (x - 1) / 2;
            }
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int x = console.nextInt();
        toBinary(x);
    }
}
