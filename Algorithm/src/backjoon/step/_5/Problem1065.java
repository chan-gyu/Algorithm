package backjoon.step._5;

import java.util.Scanner;

public class Problem1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(d(n));
	}
	
	public static int d(int n) {
		int cnt = 0; //한수 카운팅
		
		if(n <100) {
			return n;
		}else {
			cnt=99;
			
			for(int i=100; i<=n; i++) {
				int hun = i/100; //백의 자리수
				int ten = (i/10)%10; //십의 자리수
				int one = i%10; //일의 자리수
				
				if((hun-ten)==(ten-one)) {  //각 자릿수가 수열을 이루면
					cnt++;
				}
			}
		}
		return cnt;
	}

}
