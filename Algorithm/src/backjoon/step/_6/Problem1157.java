package backjoon.step._6;

import java.util.Scanner;

public class Problem1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] alpabet = new int[26];
		String str = sc.nextLine().toUpperCase();
		
		for(int i=0; i<str.length(); i++) {
			int tn = str.charAt(i)-65;
			alpabet[tn]++;
		}
		
		int max = -1;
		char ch = '?';
		for(int i=0; i<alpabet.length;i++) {
			if(alpabet[i]>max) {
				max = alpabet[i];
				ch = (char) (i + 65);
			}else if(alpabet[i] == max) { 
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
