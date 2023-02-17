package backjoon.step._6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr[];
		boolean result;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			arr = new int[26];
			String s = br.readLine();
			int ch = s.charAt(0)-'a';
			arr[ch]++;
			result = true;
			
			for(int j=1;j<s.length();j++) {
				ch = s.charAt(j)-'a';
				if(s.charAt(j-1) != s.charAt(j)) {
					arr[ch]++;
					if(arr[ch] == 2) {
						result = false;
						break;
					}
				}
			}
			if(result) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
