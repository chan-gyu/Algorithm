package backjoon.step._6;

import java.util.Scanner;

public class Problem11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = sc.nextInt();
		String a = sc.next();
		for(int i=0;i<num;i++) {
			sum += Integer.parseInt(a.substring(i,i+1));
		}
		System.out.println(sum);
		

	}

}
