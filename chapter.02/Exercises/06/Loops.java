public class Loops{
	public static void main(String[] args){
		for(int r = 1; r <= 7; r++) {
			for(int c = 1; c <= r; c++)
				System.out.print(r);
			System.out.println();
		}
	}
}