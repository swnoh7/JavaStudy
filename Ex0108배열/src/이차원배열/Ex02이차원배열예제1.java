package 이차원배열;

import java.util.Iterator;

public class Ex02이차원배열예제1 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 21;

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		array[1][0] = num++;
		array[2][0] = num++;
		array[3][0] = num++;
		array[4][0] = num++;

		array[0][1] = num++;
		array[1][1] = num++;
		array[2][1] = num++;
		array[3][1] = num++;
		array[4][1] = num++;

		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;
		array[0][0] = 21;

	}

}
