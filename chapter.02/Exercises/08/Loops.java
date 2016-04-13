public class Loops{
	public static void main(String[] args){
		for(int r = 1; r <= 5; r++) {
			for(int c = 4 - r; c >= 0; c--)
				System.out.print(" ");	
			for(int d = 1; d <= r; d++)
				System.out.print(r);
			System.out.println();
		}
	}
}