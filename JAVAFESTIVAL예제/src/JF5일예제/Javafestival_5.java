package JF5일예제;

import java.util.Arrays;

public class Javafestival_5 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];
		int min = point[0] - point[1];

		for (int i = 0; i < point.length; i++) {

			for (int j = i + 1; j < point.length; j++) {

				int dist = point[i] - point[j];

				if (dist < 0)
					dist = point[j] - point[i];

				if (min > dist) {
					min = dist;
					result[0] = i;
					result[1] = j;
				}
			}
		}
		System.out.println("result = " + Arrays.toString(result));
	}

}
