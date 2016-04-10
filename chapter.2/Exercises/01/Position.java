public class Position{
    public static void main(String[] args){
        double initial_position = 0;
        double initial_velocity = 5;
        double acceleration = 9.81;
        int time =10;
        double final_position = initial_position + initial_velocity * time +
                                0.5 * acceleration * time * time;
        System.out.println("The final position is " + final_position);
    }
}
