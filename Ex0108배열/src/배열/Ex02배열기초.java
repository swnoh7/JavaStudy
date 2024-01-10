package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		// 배열의 길이
		// 변수명.length;
		int length = numbers.length;
		System.out.println("배열의길이 : " + length);

		// 배열의 각 칸을 5의 배수로 초기화해주세요

		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 5 * (i + 1);
		}

		// 배열의 값을 전부 출력
		// 5 10 15 20 25
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
		
		System.out.println();
		
		// 배열을 생성함과 동시에 데이터를 집어 넣는 방법
		String[] names = {"노승우", "조은해", "강우석"};
		
		// 강우석이라는 데이터를 출력하기
		
		System.out.println(names[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
