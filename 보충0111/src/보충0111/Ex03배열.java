package 보충0111;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03배열 {

	public static void main(String[] args) {

		// 배열 --> 여러개의 데이터를 일괄된 순서로 한번에
		// 다룰 수 있는 데이터 구조(자료 구조)

		// 숫자 데이터 5개를 담을 수 있는 array배열을 만들고싶어요!
//		int[] array = new int[5];
//
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;
//		array[3] = 40;
//		array[4] = 50;
//		
//		for (int i = 0; i < array.length; i++) {
//			array[i] = 10 * (i+1);
//			System.out.println(array[i] + " ");
//		}

		
		// 정수 데이터 10개를 담을 수 있는 numArray를 만들어주세요
		// numArray에 사용자가 입력한 값을 전부 채워주세요
		
		Scanner sc = new Scanner(System.in);
		
		int [] numArray = new int[10];
		
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" ");
			numArray[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(numArray));
	}
	
	

}
