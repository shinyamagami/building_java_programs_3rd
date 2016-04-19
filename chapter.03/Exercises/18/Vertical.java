public class Vertical{
    public static void vertical(String s){
        int l = s.length(); // l for the number of length of the string
        for (int i = 0; i <= l -1; i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[] args){
        vertical("hey now");
    }
}
