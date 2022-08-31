package backjoon.step._4;

import java.util.Scanner;

public class Problem1546 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int a=0;
		double avg=0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			avg +=((double)arr[i]/(double)a)*100;
		}
		System.out.println(avg/n);
		
	}

}
