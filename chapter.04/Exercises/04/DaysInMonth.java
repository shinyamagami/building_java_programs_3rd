import java.util.*; // for Scanner

public class DaysInMonth{
    public static int daysInMonth(int month){
        if (month == 1){
            int days = 31;
            return days;
        } else if (month == 2){
            int days = 28;
            return days;
        } else if (month == 3){
            int days = 31;
            return days;
        } else if (month == 4){
            int days = 30;
            return days;
        } else if (month == 5){
            int days = 31;
            return days;
        } else if (month == 6){            
            int days = 30;
            return days;
        } else if (month == 7){
            int days = 31;
            return days;
        } else if (month == 8){
            int days = 31;
            return days;
        } else if (month == 9){
            int days = 30;
            return days;
        } else if (month == 10){
            int days = 31;
            return days;
        } else if (month == 11){
            int days = 30;
            return days;
        } else {
            int days = 31;
            return days;
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a interger for a month: ");
        int month = console.nextInt();
        int result = daysInMonth(month);
        System.out.println("The number of days of the month is " + result);
    }
}
