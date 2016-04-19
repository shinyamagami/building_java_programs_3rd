public class PadString{
    public static String padString(String s, int l){
        int n = s.length(); // n for the number of letters of the string
        int g = l - n; // gap for l minus n
        for (int i = 0; i <= g - 1; i++){
            s = s + " ";
        }
        return s;
    }
    public static void main(String[] args){
        System.out.println("\"" + padString("hello", 8) + "\"");
        System.out.println("\"" + padString("congratulations", 8) + "\"");
    }
}
