package backjoon.step._2;

import java.util.Scanner;

public class Problem1330 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a < b ? "<" : a == b ? "==" : ">");
	}

}
