package backjoon.step._2;

import java.util.Scanner;

public class Problem2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int reh = h;
		int rem = 0;

		rem = m >= 45 ? m-45 : m+15;
		if(m <45) reh = h == 0 ? 23 : h-1;
		
		System.out.println(reh+ " " + rem);
	}

}
