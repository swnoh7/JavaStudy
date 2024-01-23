package dowhile문;

import java.util.Random;

public class Ex02랜덤수만들기 {

	public static void main(String[] args) {

		// 랜덤한 숫자를 뽑아내는 방법
		// 1. 랜덤한 숫자를 뽑아내는 도구를 꺼내오기
		Random ran = new Random();
		// 2. 랜덤한 수를 생성하기
		// 0부터 시작해서 추출하고싶은 숫자의 갯수를 적기
		// 1~9 추출 (9만 쓸경우 0~8임 그래서 +1해줘야함)
		int ranNum = ran.nextInt(9)+1;
		System.out.println(ranNum);
	}

}
