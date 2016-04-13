public class Squares{
	public static void main(String[] args){
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();

		int x = 2;
		int y = 2;

		for (int j = 1; j <= 100; j++) {
			System.out.print(j + " ");
			j = j + x;
			x = x + y;
		}
		System.out.println();
	}

}
