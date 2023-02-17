package backjoon.step._4;

import java.util.Scanner;

public class Problem10807 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[sc.nextInt()];
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		
		int v = sc.nextInt();
		int cnt = 0;
		for(int i=0; i< n.length; i++) {
			if(v == n[i]) cnt++;
		}
		System.out.println(cnt);
		
		
	}

}
