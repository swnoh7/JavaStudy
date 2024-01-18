package 보충0111;

public class Ex01for문 {

	public static void main(String[] args) {
		
//		//for : 반복 횟수가 정해져 있을때 (언제부터~언제까지)
//		//i=0 .... 0
//		//i=1 .... 1
//		//i=2 .... 2
//		//i=3 조건에서 cut!
//		for(int i =0; i < 3; i++) {
//			System.out.println(i);
//		}
//		
//		// 1부터 9까지 출력시켜주세요
//		for(int i = 1; i < 10; i++) {
//			System.out.print(i + " ");
//		}
//		
//		
//		// 구구단 2단을 출력시켜주세요
//		for(int i = 1; i < 10; i++) {
//			int result = 2 * i;
//			System.out.println("2*" + i + " =" + result);
//		}
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(-i + " ");
				sum += -i;
			} else {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.print("결과 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
