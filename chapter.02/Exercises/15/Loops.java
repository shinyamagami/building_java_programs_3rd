public class Loops{
	public static void main(String[] args){
		printDesign();
	}
	public static void printDesign(){
		for (int i = 1; i <= 5; i++){
			for (int j = 6 - i; j >= 1; j--){
				System.out.print("-");
			}
			for (int k = 2 * i - 1; k <= 9; k += 2){
					System.out.print(k);

			}

			System.out.println();
		}
	}
}
