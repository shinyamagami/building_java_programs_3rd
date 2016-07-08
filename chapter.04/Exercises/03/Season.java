import java.util.*; // for Scanner

public class Season{
    public static String season(int m, int d){
        if (d >= 16){
            if(m == 12 || m == 1 || m == 2){
                return "Winter";
            } else if (m == 3 || m == 4 || m == 5){
                return "Spring";
            } else if (m == 6 || m == 7 || m == 8){
                return "Summer";
            } else {
                return "Fall";
            }
        else{
            if(m == 1 || m == 2 || m == 3){
                return "Winter";
            } else if (m == 4 || m == 5 || m == 6){
                return "Spring";
            } else if (m == 7 || m == 8 || m == 9){
                return "Summer";
            } else {
                return "Fall";
            }
        }
        return "error";
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a month in a integer: ");
        int month = console.nextInt();
        System.out.print("Please enter a day in a integer: ");
        int day = console.nextInt();
        String result = season(month, day);
        System.out.println(result);
    }
}
