package 보충0111;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class FUCKLOTTO {

	public static void main(String[] args) {

		// 중복없이 숫자 6개 뽑기
		int[] roto = new int[6];

		Random ran = new Random();

		// 랜덤 값으로 배열에 값 담아주기
		for (int i = 0; i < roto.length; i++) {
			roto[i] = ran.nextInt(50);
			// 앞서 뽑은 숫자와 비교하는 반복문
			for (int j = 0; j < i; j++) {
				if (roto[j] == roto[i]) {
					// 앞서 뽑은숫자와 같은 수가있다면
					// 다시 뽑기 위해서 인덱스 값을 1감소
					i--;
				}
			}

		}
System.out.println(Arrays.toString(roto));
	}
}
