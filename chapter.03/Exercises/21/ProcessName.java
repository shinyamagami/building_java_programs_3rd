import java.util.*; // For Scanner

public class ProcessName{
    public static void processName(){
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String name = console.nextLine();
        /*
        ** .next() is for one word and nextLine() is for the next line
        */
        int space = name.indexOf(" ");
        // System.out.println(space);
        int length = name.length();
        // System.out.println(length);
        String last_name = name.substring(space + 1, length);
        String first_name = name.substring(0, space);
        System.out.println(last_name + ", " + first_name );
    }
    public static void main(String[] args){
        processName();
    }
}
