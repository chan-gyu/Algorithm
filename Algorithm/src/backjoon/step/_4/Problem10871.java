package backjoon.step._4;

import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		int x = sc.nextInt();
		String str = "";
		for(int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length;i++) {
			if(x>a[i]) str+=a[i] + " ";
		}
		System.out.println(str);
	}

}
