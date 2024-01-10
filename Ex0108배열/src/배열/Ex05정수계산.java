package 배열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex05정수계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		

		int[] array = new int[5];
		int max = 0;
		int sum = 0;
		float avg = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}

		System.out.println("입력된 정수 :" + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}

		}
		System.out.println("최고 점수 : " + max);
		
		int low = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] <= low) {
				low = array[i];
		}
		}
		System.out.println("최저 점수 : " + low);
		
		for(int i =0; i <array.length; i++) {
			sum += array[i];
			avg = (float) sum / 5;
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		

	}

}

