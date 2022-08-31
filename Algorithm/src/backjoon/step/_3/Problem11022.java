package backjoon.step._3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}
	}

}
