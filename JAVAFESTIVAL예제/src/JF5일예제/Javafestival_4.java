package JF5일예제;

import java.util.Scanner;

public class Javafestival_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [5];
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			array[i] = sc.nextInt();
				}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ":");
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
