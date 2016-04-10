public class Fibonacci{
	public static void main(String[] args){

		int x = 1;
		int y = 1;

		for(int i = 1; i <= 6; i++) {
			System.out.print(x + " " + y + " ");
			x = x + y;
			y = x + y;
		}
	}
}