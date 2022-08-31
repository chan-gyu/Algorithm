package backjoon.step._3;

import java.util.Scanner;

public class Problem10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a+b);
//		}
		
		int n = sc.nextInt();
        int[] re = new int[n];
        for(int i=0; i<n; i++){
            re[i] = sc.nextInt()+sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            System.out.println(re[i]);
        }
		
	}

}
