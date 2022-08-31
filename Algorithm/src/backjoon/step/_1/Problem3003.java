package backjoon.step._1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3003 {

	private static final BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); 
	//BufferedReader는 개행문자만 경계로 인식, 입력받은 데이터 String 고정이므로 따로 데이터를 가공해야하는 경우가 많음 하지만 Scanner 보다 속도가 빠름.
	//ex) 데이터를 하나씩 보내는 것보다 한번에 모아서 보내는게 더 효율적.
	
	
	public static void main(String[] args) throws Exception {
		
		String str = bfr.readLine(); //readLine() 입력
		StringTokenizer st = new StringTokenizer(str);
		//BufferedReader는 라인단위로 읽어들이기 때문에 StringTokenizer을 이용하여 문자열을 토큰화하여 특정 문자에 따라 문자열을 나눈다.
		//(문자열) = 띄어쓰기 기준으로 문자열 분리
		//(문자열,구분자) = 구분자를 기준으로 문자열을 분리
		//(문자열,구분자,true/false) 구분자를 기준으로 문자열을 분리할 때, 구분자도 토큰으로 넣을지(true) 구분자는 분리된 문자열 토큰에 포함시키지 않을지(false), default(false)
		int[] arr = {1,1,2,2,2,8};
		String result="";
		
		int i = 0;
		while(st.hasMoreTokens()) { //hasMoreTokens() = 토큰확인 true / false 반환
			int in = Integer.parseInt(st.nextToken()); //nextToken() = 다음 토큰 반환
			result += (arr[i] - in + " ");
			i++;
		}
		System.out.println(result.substring(0, result.length()-1));
	}

}
