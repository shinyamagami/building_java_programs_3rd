import java.util.*; // for Scanner

public class Season{
    public static String season(int month, int day){
        if (month == 12){
            if (day >= 16){
                return "winter";
            } else {
                return "fall";
            }
        } else if (month == 1 || month == 2){
            return "winter";
        }
        if (month == 3){
            if (day >= 16){
                return "spring";
            } else {
                return "winter";
            }
        } else if (month == 4 || month == 5){
            return "spring";
        }
        if (month == 6){
            if (day >= 16){
                return "summer";
            } else {
                return "spring";
            }
        } else if (month == 7 || month == 8){
            return "summer";
        }
        if (month == 9){
            if (day >= 16){
                return "fall";
            } else {
                return "sumer";
            }
        } else if (month == 10 || month == 11){
            return "fall";
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
