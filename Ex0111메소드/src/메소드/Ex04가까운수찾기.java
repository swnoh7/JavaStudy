package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
		
	}

//	public static int close10(int num1, int num2) {
//		int result = 0;
//		num1 = num1 - 10;
//		num2 = num2 - 10;
//		if(num1 * num1 == num2 * num2) {
//			result = 0;
//		} else if (num1 * num1 > num2 * num2) {
//			result = num2 + 10;
//		} else {
//			result = num1 + 10;
//		}
//		return result;
//	}
	
	// 자바에서 절대값 만들기
	public static int close10(int num1, int num2) {
		if(Math.abs(10-num1) > Math.abs(10-num2)) {
			return num2;
		} else if(Math.abs(10-num1) < Math.abs(10-num2)){
			return num1;
		} else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

