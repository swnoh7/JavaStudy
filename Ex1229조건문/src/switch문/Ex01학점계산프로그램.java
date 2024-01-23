package switch문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("점수 입력 : ");
//		
//		int totalScore = sc.nextInt();
//		
//		switch(totalScore) {
//		case 100,99,98,97,96,95,94,93,92,91:
//			System.out.println("A학점입니다.");
//			break;
//		case 90,89,88,87,86,85,84,83,82,81:
//			System.out.println("B학점입니다.");
//			break;
//		case 80,79,78,77,76,75,74,73,72,71:
//			System.out.println("C학점입니다.");
//			break;
//		default:
//			System.out.println("D학점입니다.");
//			break;
//		}
		
		
		// 교수님 Ver.
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
		System.out.print("점수 입력:");
		int totalScore = sc.nextInt();
		// 3. 학점 계산하기 ---> switch문으로
		char grade = 'A';
		switch(totalScore/10) {
		case 10, 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
		}
		System.out.println(grade + "학점입니다.");
	}

}
