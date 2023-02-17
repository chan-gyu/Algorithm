package backjoon.step._6;

import java.util.Scanner;

public class Problem2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		String rstr = sb.reverse().toString();
		
		String[] st = rstr.split(" ");
		
		if(Integer.parseInt(st[0]) > Integer.parseInt(st[1])) {
			System.out.println(st[0]);
		}else {
			System.out.println(st[1]);			
		}
	}

}
