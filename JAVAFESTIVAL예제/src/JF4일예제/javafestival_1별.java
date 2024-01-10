package JF4일예제;

import java.util.Scanner;

public class javafestival_1별 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 :");
		int input = sc.nextInt();
//		System.out.print("*");
//		System.out.println();
		for (int j = 1; j <= input; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
