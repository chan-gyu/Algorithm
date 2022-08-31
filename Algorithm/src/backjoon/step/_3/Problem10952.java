package backjoon.step._3;

import java.util.Scanner;

public class Problem10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 9999;
		int count = 0;
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() + sc.nextInt();
			if(a[i]==0) {
				break;
			}else {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(a[i]);
		}
	}
}
