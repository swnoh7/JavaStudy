package JF2일예제;

import java.util.Random;
import java.util.Scanner;

public class JavaFestival_3 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int fail = 0;
		do {
			int ranNum1 = ran.nextInt(10);
			int ranNum2 = ran.nextInt(10);
			System.out.print(ranNum1 + "+" + ranNum2 + "=");
			int right = ranNum1 + ranNum2;
			int answer = sc.nextInt();

			if (answer == right) {
				System.out.println("SUCCESS!");
			} else if (answer != right){
				fail++;
				System.out.println("Fail...");
			} if (fail == 5) {
				System.out.println("GAMEOVER..");
				break;
			}
		} while (true);

		// do-while 말고 while 사용
//		Scanner sc = new Scanner(System.in);
//
//		Random ran = new Random();
//		
//		int fail = 0;
//		
//		while(true) {
//			int ranNum1 = ran.nextInt(10);
//			int ranNum2 = ran.nextInt(10);
//			
//			System.out.print(ranNum1 + " + " + ranNum2 + " =");
//			int right = ranNum1 + ranNum2;
//			int answer = sc.nextInt();
//			if(answer == right){
//				System.out.println("SUCCESS!");
//			} else {
//				fail++;
//				System.out.println("Fail...");
//			} if(fail == 5) {
//				System.out.println("GAME OVER!!");
//				break;
//			}
//		}
//	}
	}

}
