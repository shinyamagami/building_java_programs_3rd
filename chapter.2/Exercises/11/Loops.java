public class Loops{
	public static final int X = 12340;
	public static final int Y = 12345670;

	public static void main(String[] args){
		drawVar();
		System.out.println();
		repeatX();
		System.out.println();
		drawVar2();
		System.out.println();
		repeatY();
		System.out.println();
	}
	public static void drawVar(){
		for(int i = 1; i <= 10; i++){
			for(int j =1; j <= 4; j++){
				System.out.print(" ");
			}
			System.out.print("|");
		}
	}
	public static void repeatX(){
		for(int i = 1; i <= 10; i++){
			System.out.print(X);
		}
	}
	public static void drawVar2(){
		for(int i = 1; i <= 7; i++){
			for(int j =1; j <= 7; j++){
				System.out.print(" ");
			}
			System.out.print("|");
		}		
	}
	public static void repeatY(){
		for(int i = 1; i <= 7; i++){
			System.out.print(Y);
		}	
	}
}


