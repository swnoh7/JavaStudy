package JF4일예제;

import java.util.Scanner;

public class Javafestival_3역에역별 {

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
			} // inner for1(공백 넣어주는 애)

			for (int i = 0; i < j; i++) {
				System.out.print("*");
			} // inner for2(별 찍어주는애)
 			System.out.println();
		} // outer for(줄 바꿔주는 애)
		
//		Scanner sc = new Scanner(System.in);
//		int num =sc.nextInt();
//		
//		for(int i = num; i > 0; i--) {
//			for(int j = 2; j <= num + 1; j++) {
//				System.out.print(j > i ? "*" : " ");
//			}
//			System.out.println();
//		}

	}

}
