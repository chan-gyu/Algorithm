package backjoon.step._4;

import java.util.Scanner;

public class Problem5597 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[] b = new boolean[31];
		
		for(int i=0; i<28; i++) {
			b[sc.nextInt()] = true;
		}
		
		for(int i=1; i<=30; i++) {
			if(!b[i]) {
				System.out.println(i);
			}
			
		}
	}

}
