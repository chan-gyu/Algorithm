package programmers.level2;

public class Solution2_01 {

	public String solution(String s) {
	    String answer = "";
	    String[] str = s.split(" ");
	    
	    int max, min; 
	    max=min= Integer.parseInt(str[0]);
	    
	    //max
	    for (String st : str) {
	    	if(Integer.parseInt(st)>max) {
	    		max=Integer.parseInt(st);
	    	}
		}
	    //min
	    for (String st : str) {
	    	if(Integer.parseInt(st)<min) {
	    		min=Integer.parseInt(st);
	    	}
		}
        
        return answer+min+" "+max;
    }
	
	
	/*
	문제 설명
 	문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
 	str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을
 	반환하는 함수, solution을 완성하세요.
	예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
	
	제한 조건
	s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
	
	입출력 예
		s			return
	"1 2 3 4"		"1 4"
	"-1 -2 -3 -4"	"-4 -1"
	"-1 -1"			"-1 -1"
	*/

}
