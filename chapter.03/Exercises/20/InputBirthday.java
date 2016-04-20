import java.util.*;  // for Scanner

public class InputBirthday{
    public static void inputBirthday(){
        Scanner console = new Scanner(System.in);

        System.out.print("On what day of the month were you born?: ");
        String day = console.next();

        System.out.print("What is the name of the month in which you were " +
                        "born?: ");
        String month = console.next();

        System.out.print("During what year were you born?: ");
        String year = console.next();

        System.out.println("You were born on " + month + " " + day + ", " +
                            year + ". You’re mighty old!");
    }
    public static void main(String[] args){
        inputBirthday();
    }
}
