package JF3일예제;

import java.util.Scanner;

public class Javafestival_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = 0;
		int sum = 0;
		int namo = 0;
		int num = 0;
		
			System.out.print("정수 입력 : ");
			
			input = sc.nextInt();
		
			while(num < 8) {
				num++;
				sum = input % 10;
				input = input / 10;
				namo += sum;
			}
			System.out.println("합은 "+ namo +"입니다.");				

	}
}
