package backjoon.step._3;

import java.util.Scanner;

public class Problem1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int a,b = 0;
		
		int c = n;
		
		while(true) {
			a=c/10;
			b=c%10;
			c=(b*10)+(a+b)%10;
			cnt++;
			if(n==c) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
