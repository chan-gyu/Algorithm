package backjoon.step._5;

import java.util.ArrayList;
import java.util.List;

public class Problem4673 {
	public static void main(String[] args) throws Exception {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			int n = d(i); //1~10000
			if(list.indexOf(n) == -1 && n <= 10000) list.add(n);
//			System.out.println(list.get(n));
		}
		for (int i = 1; i <= 10000; i++) {
			if(list.indexOf(i) == -1) System.out.println(i);
		}
		
		
	}
	
	public static int d(int n) {
		int re = n; //1234
		
		if(n >= 10000) {
			
		}else if (n >= 1000) {
			re += n / 1000; // xxxx자리
			re += (n%1000) /100;// xxx자리
			re += (n%100) /10;// xx자리 
		}else if (n >= 100) {
			re += n / 100;
			re += (n%100) /10;
		}else if (n >= 10) {
			re += n / 10;
		}
		
		re += n%10; //x자리
		return re;
	}
	
}
