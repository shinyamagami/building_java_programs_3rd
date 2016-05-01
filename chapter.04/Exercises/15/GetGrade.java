import java.util.*;

public class GetGrade{
    public static void getGrade(double score){
        double grade = 0.0;
//        double base =
        if (score < 60){
            grade = 0.0;
        } else if (score >= 60 && score <=62){
            grade = 0.7;
        } else if (score > 63 || score < 95){
            grade = 0.8 + (score - 63) / 10;
        } else {
            grade = 4.0;
        }
        System.out.printf("Your grade is %.1f", grade);
        System.out.println();
    }
    public static double getInput(Scanner console){
        System.out.print("Please enter a score as an integer between 0 and " +
                        "100 inclusive: ");
        double score = console.nextDouble();
        if (score < 0 || score > 100){
            throw new IllegalArgumentException("The number you input is not " +
            "valid.");
        }
/*
        while (score < 0 || score > 100){

            System.out.print("Please enter a score as an integer between 0 and " +
                            "100 inclusive: ");
            score = console.nextDouble();
        }
*/
        return score;
    }


    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        double score = getInput(console);
        getGrade(score);
    }
}
