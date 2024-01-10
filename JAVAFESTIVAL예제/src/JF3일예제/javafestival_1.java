package JF3일예제;

public class javafestival_1 {

	public static void main(String[] args) {

		int pnum = 0;
		int mnum = 0;
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if(i % 2 == 1) {
				pnum = i;
				System.out.print(pnum + " ");
			} else {
				mnum = -i;
				System.out.print(mnum + " ");
				sum += pnum + mnum;
			}
		}
		System.out.println();		
		System.out.println("결과 : " + sum);

	}

}
