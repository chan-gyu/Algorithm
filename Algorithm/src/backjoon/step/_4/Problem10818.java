package backjoon.step._4;

import java.util.Scanner;

public class Problem10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		for(int num : arr) {
			if(num < min) {
				min = num;
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
