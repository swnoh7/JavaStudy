package 이중for문;

public class Ex04공포의별찍기 {

	public static void main(String[] args) {

		
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.println();

//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

//		for(int j = 5; j > 0; j--){
//		for(int i = 5; i > 0; i--) {
//			System.out.print(" ");
//		}
//		
//		for(int s = 0; s < 5; s++) {
//			System.out.print("*");
//		}System.out.println();
//		}
		
		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < 5-j; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
