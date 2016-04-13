public class Loops{
	public static void main(String[] args){
		drawVar();
		drwaNumber();

	}
	public static void drawVar(){
		for (int i = 1; i <= 6; i++){
			for(int j = 1; j <= 9; j++){
				System.out.print(" ");
			}
			System.out.print("|");
		}
		System.out.println();
	}

	public static void drwaNumber(){
		for (int i = 1; i <= 6; i++){
			for(int j = 1; j <= 9; j++){
				System.out.print(j);
			}
			System.out.print("0");
		}
		System.out.println();
	}

}