package backjoon.step._6;

import java.util.Scanner;

public class Problem1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		String[] str = sc.nextLine().split(" ");
		
		for(int i=0;i<str.length;i++) {
			if(str[i].length()!=0) cnt++;
		}
		System.out.println(cnt);
		
	}

}
