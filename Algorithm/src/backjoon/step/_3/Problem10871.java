package backjoon.step._3;

import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		String v="";
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(a[i]<x) v += a[i]+" ";
		}
		System.out.println(v);
	}
}