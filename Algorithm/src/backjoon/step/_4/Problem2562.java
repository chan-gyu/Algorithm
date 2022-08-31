package backjoon.step._4;

import java.util.Scanner;

public class Problem2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int n=0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				n=i;
			}
		}
		System.out.println(max);
		System.out.println(n+1);
		
	}

}
