package backjoon.step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10809 {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		String n = br.readLine();
		int[] re = new int[26];
		for(int i=97; i<=122; i++) { //ASCII 소문자 a~z 97~122
			char str = (char)i; //str = 97~122
			re[i-97] = n.indexOf(str); //indexOf=특정문자 위치의 인덱스 리턴 찾는 문자열이 없으면 -1리턴// n=backjoon  n.indexOf(str) = str에 해당하는 backjoon의 인덱스 값 찾기 
		
		}
		for(int i=0;i<26;i++) {
			if(i==25) System.out.print(re[i]);
			System.out.println(re[i]+" ");
		}
			
	}

}
