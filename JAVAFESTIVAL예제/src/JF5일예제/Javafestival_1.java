package JF5일예제;

import java.util.Random;

public class Javafestival_1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] array = new int[8];
		int max = 0;
		
		System.out.print("배열에 있는 모든 값 : ");
		
		for(int i =0; i < array.length; i++) {
			array[i] = ran.nextInt(100)+1;
			System.out.print(array[i] + " ");
			}
		
//      System.out.print("배열에 있는 모든 값 : " + Arrays.toString(array));		
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= max) {
				max = array[i];
			}
		}
		
		int low = array[0];
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] <= low) {
				low = array[i];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + low);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
