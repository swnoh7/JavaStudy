package JF4일예제;

import java.util.Scanner;

public class javafestival_2역별 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int input = sc.nextInt();
		
		for (int j = input; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
