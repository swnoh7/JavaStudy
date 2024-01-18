package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		// 이차원 배열
		// : 배열 안에 또다른 배열이 있는 형태
		// : 참조가 2번 일어나는 형태(참조의 참조다)
		
		// 1. 이차원 배열 선언방법
		// 자료형 [][] 변수명 = new 자료형 [행][열];
		int[][] array = new int[5][5];
		
		System.out.println(array[0][0]);
		array[1][1] = 5;
		System.out.println(array[1][1]);
		
		// 이차원배열에 값 넣기!(1~9)
		int num = 1;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}
		
//		array[0][0] = num++;
//		array[0][1] = num++;
//		array[0][2] = num++;
//		
//		for (int i = 0; i < array.length; i++) {
//			array[1][i] = num++;
//		}
//		array[1][0] = num++;
//		array[1][1] = num++;
//		array[1][2] = num++;
//		
//		for (int i = 0; i < array.length; i++) {
//			array[2][i] = num++;
//		}
//		array[2][0] = num++;
//		array[2][1] = num++;
//		array[2][2] = num++;
		
//		값을 빨리 보고싶을때 ㄱㄱ
//		System.out.println(Arrays.toString(array[0]));
//		System.out.println(Arrays.toString(array[1]));
//		System.out.println(Arrays.toString(array[2]));
		
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
