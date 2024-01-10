package 이차원배열;

public class Ex03이차원배열예제2 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 21;

		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else if (j % 2 == 1) {
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}
			}
		}

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}
}
