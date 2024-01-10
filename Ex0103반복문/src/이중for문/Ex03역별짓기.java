package 이중for문;

public class Ex03역별짓기 {

	public static void main(String[] args) {

		// *****
		// ****
		// ***
		// **
		// *

		for (int j = 5; j > 0; j--) {
			for (int i = j; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
