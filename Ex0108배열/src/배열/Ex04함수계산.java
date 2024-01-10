package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04함수계산 {

	public static void main(String[] args) {

//		int[] array = new int[5];
//		int Large = 0;
//
//		Random ran = new Random();
//
//		System.out.print("배열 안에 들어있는 값 : ");
//
//		for (int i = 0; i < array.length; i++) {
//			array[i] = ran.nextInt(10) + 1;
//		}
//		for (int i = 0; i < array.length; i++) {
//			if (Large < array[i]) {
//				Large = array[i];
//			}
//
//		}
//
//		System.out.print(Arrays.toString(array));
//		System.out.println("가장 큰 값은 " + Large + "입니다.");

		// 교수님 Ver.
		// 1. 정수형 데이터 5개를 저장하는 배열 선언
		int[] array = new int[5];
		// 2. 랜덤한 숫자로 배열 초기화하기(1~10)
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
		}
		// 3. 가장 큰 수를 선언하는 변수 max선언
		int max = 0;
		// 4. max와 배열 안에 들어있는 값 비교하기 (0번 인덱스부터 차근차근)
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				// 5. 만약 배열안에 들어있는 값이 max보다 크다면
				// max를 배열안에 있는 값으로 변경
				max = array[i];
			}
		}
		// 6. 배열안의 모든 값 출력하기
		System.out.println("배열 안에 들어있는 값: " + Arrays.toString(array));
		// 7. 가장 큰 값 출력하기
		System.out.println("가장 큰 값은" + max + "입니다.");

	}
}
