package backjoon.step._6;

import java.util.Scanner;

public class Problem2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] st = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String str = sc.nextLine();
		
		for(int i=0;i<st.length;i++) {
			str=str.replaceAll(st[i], "e");
		}
		System.out.println(str.length());
	}

}
