package backjoon.step._2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem2480 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;

		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		
		if(a==b&&a==c) sum+=10000+(1000*a);
		else if((a==b||a==c)) sum+=1000+(100*a);
		else if(b==c) sum+=1000+(100*b);
		else if(a!=b&&b!=c&&a!=c) sum = Collections.max(list)*100;
		
		System.out.println(sum);
	}

}
