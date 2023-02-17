package backjoon.step._6;

import java.util.Scanner;

public class Problem2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] stra = new String[n];
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			String s2="";
			sc.nextLine();
			String str = sc.nextLine();
			
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<a;k++) {
					s2+=str.charAt(j);
				}
			}
			stra[i-1]=s2;		
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(stra[i]);
		}
		
	}

}
