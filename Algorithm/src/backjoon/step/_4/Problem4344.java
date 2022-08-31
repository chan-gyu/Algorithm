package backjoon.step._4;

import java.util.Scanner;

public class Problem4344 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double[] d = new double[c];
		
		for (int i = 0; i < c; i++) {
			double avg = 0;
			double sum = 0;
			int n = sc.nextInt();
			int[] s = new int[n];
			int cnt = 0;
			
			
			for (int j = 0; j < n; j++) {
				s[j] = sc.nextInt();
				sum+=s[j];
			}
			
			avg=sum/n;

			for (int j = 0; j < n; j++) {
				if(s[j] > avg) {
					cnt++;
				}
			}
			d[i]=((double)cnt/n)*100;
		}
		
		for (int i = 0; i < c; i++) {
			System.out.printf("%.3f",d[i]);
			System.out.println("%");
		}
		
	}

}
