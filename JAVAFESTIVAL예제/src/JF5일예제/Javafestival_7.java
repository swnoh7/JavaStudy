package JF5일예제;

import java.util.Scanner;

public class Javafestival_7 {

	public static void main(String[] args) {

		int [] array = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번쨰 수 입력 : ");
			array[i] = sc.nextInt();
		}
		
		for (int j = 0; j < array.length; j++) {
			for (int i = j+1; i < array.length; i++) {
				if(array[i] < array[j]) {
					int change = array[i];
					array[i] = array[j];
					array[j] = change;
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
