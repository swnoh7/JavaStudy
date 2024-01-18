package java복습;

import java.util.Scanner;

public class java연습장 {

	public static void main(String[] args) {

	String str = "01001101";
	
	int sum = 0;
	int cnt = 1;
	
	for (int i = str.length() -1; i >= 0; i--) {
			if(str.charAt(i) == '1') {
				sum += cnt;
			}
			cnt *= 2;
		}
	
	System.out.println(str + "(2)" + "=" + sum + "(10)");
	
	
	}
	
}