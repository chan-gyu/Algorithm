package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution17 {

	public int[] solution(int[] arr, int divisor) {
       /* 
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor==0) list.add(arr[i]);
        }
        if(list.isEmpty()) {
        	list.add(-1);
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size();i++) {
        	answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
        */
        
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length==0) answer = new int[] {-1};
        Arrays.sort(answer);
        
        return answer;
        	        
    }
	
	
	/*
	 * 문제 설명
	 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
	 * solution을 작성해주세요.
	 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	 * 
	 * 제한사항
	 * arr은 자연수를 담은 배열입니다.
	 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	 * divisor는 자연수입니다.
	 * array는 길이 1 이상인 배열입니다.
	 * 
	 * 입출력 예 
	 * 		arr			divisor		return 
	 * [5, 9, 7, 10]		5 		[5,10] 
	 * [2, 36, 1, 3] 		1 		[1, 2, 3, 36] 
	 * [3,2,6] 				10 		[-1]
	 */

}
