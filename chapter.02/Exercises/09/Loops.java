public class Loops{
	public static void main(String[] args){
		drawLine();
		System.out.println();
		drawMiddle();
		System.out.println();
		drawNumbers();
		System.out.println();
		drawLine();
		System.out.println();
	}

	public static void drawLine(){
		for (int i = 1; i <= 40; i++){
			System.out.print("-");
		}
	}

	public static void drawMiddle(){
		for (int i = 1; i <= 10; i++){
			System.out.print("_-^-");
		}
	}

	public static void drawNumbers(){
		for (int i = 1; i <= 2; i++){
			System.out.print("11223344556677889900");
		}
	}
}