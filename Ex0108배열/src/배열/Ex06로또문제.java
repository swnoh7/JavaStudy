package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또문제 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] array = new int[5];
		for (int j = 0; j < 5; j++) {
			array[j] = ran.nextInt(10)+1;
			for (int i = 0; i < j; i++) {
				if (array[i] == array[j]) {
					j--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));

//		// 1. lotto의 0번방 데이터를 랜덤한 수로 초기화 
//		array[0] = ran.nextInt(10)+1;
//		// 2. lotto의 1번방 데이터를 랜덤한 수로 초기화 
//		array[1] = ran.nextInt(10)+1; 
//		// 3. lotto[0]과 lotto[1]의 값이 같은지 비교 
//		if(array[0] == array[1]) {
//			//---> 같다면 lotto[2] 다시 랜덤한 숫자 부여하기 
//			array[1] = ran.nextInt();
//		}
//		// 4. lotto의 2번방 데이터를 랜덤한 수로 초기화 
//		array[2] = ran.nextInt(10)+1; 
//		// 4-1. lotto[0]과 lotto[2]의 값이 같은지 비교 
//		if(array[0] == array[2]) {
//			//---> 같다면 lotto[2] 다시 랜덤한 숫자 부여하기 
//			array[2] = ran.nextInt();
//		}
//		// 4-2. lotto[1]과 lotto[2]의 값이 같은지 비교 
//		if(array[1] == array[2]) {
//			//---> 같다면 lotto[2] 다시 랜덤한 숫자 부여하기
//			array[2] = ran.nextInt();
//		}
//		
//		array[3] = ran.nextInt();
//		if(array[0] == array[3]) {
//			//---> 같다면 lotto[3] 다시 랜덤한 숫자 부여하기 
//			array[3] = ran.nextInt();
//		}
//		// 4-2. lotto[1]과 lotto[3]의 값이 같은지 비교 
//		if(array[1] == array[3]) {
//			//---> 같다면 lotto[3] 다시 랜덤한 숫자 부여하기
//			array[3] = ran.nextInt();
//		}
//		
//		if(array[2] == array[3]) {
//			//---> 같다면 lotto[3] 다시 랜덤한 숫자 부여하기
//			array[3] = ran.nextInt();
//		}
//		

	}

}
