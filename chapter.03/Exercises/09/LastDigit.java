public class LastDigit{
    public static int lastDigit(int n){
        return Math.abs(n % 10);
    }

    public static void main(String[] args){
        System.out.println(lastDigit(3572));
        System.out.println(lastDigit(-947));
    }
}
