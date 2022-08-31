package backjoon.step._4;

import java.util.Scanner;

public class Problem3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt()%42;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count+= 1;
					break;
				}
			}
		}
		System.out.println(10-count);
	}

}
