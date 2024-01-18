package JF5일예제;

import java.util.Arrays;
import java.util.Scanner;

public class Javafestival_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		
		for(int i = 1; i < 11; i++) {
			System.out.print((i) + "번 째 정수 입력>> ");
			array[i-1] = sc.nextInt();
			}
		
		System.out.print("3의 배수 : ");
		
		for(int i = 1; i < 11; i++) {
			if(array[i-1] % 3 == 0) {
				System.out.print(array[i-1] + " ");
			}
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
