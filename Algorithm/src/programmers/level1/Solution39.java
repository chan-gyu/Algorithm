package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class Solution39 {
	//set을 담는 List생성
//	static List<HashSet<Integer>> setList = new ArrayList<>();

	public int[] solution(String[] id_List, String[] report, int k) {
//		int[] answer = new int[id_List.length];
//		
//		// 이름 | index로 구성 된 Map을 생성
//        Map<String,Integer> idMap = new HashMap<>();
//        for(int i=0; i<id_List.length; i++) idMap.put( id_List[i], i );  
//
//        // set List 초기화 (유저 수 만큼 set을 담은 리스트 생성)
//        setList.clear();
//        for(int i=0; i<id_List.length; i++) setList.add(new HashSet<Integer>());
//
//        StringTokenizer st;
//        String userId, reportedId;
//        for(String str : report){
//            st = new StringTokenizer(str);
//            userId = st.nextToken();
//            reportedId = st.nextToken();
//            
//            // List(0)의 set에는 0을 신고한 유저 index가 저장
//            setList.get( idMap.get(reportedId) ).add( idMap.get(userId) );
//        }
//
//        for(int i=0; i<id_List.length; i++){
//            // i 유저를 신고한 인원 = set의 사이즈
//            // set size가 k보다 크면 메일이 발송됨
//            // set안에 i를 신고한 유저 번호이므로 answer 배열에 1씩 더해 줌
//            if( setList.get(i).size() >= k ){
//                for( int reportMan : setList.get(i) ) answer[reportMan]++;
//            }
//        }
	
//**************************************************************************************************
		//객체지향적 풀이
		int[] answer = new int[id_List.length];
		ArrayList<User> users = new ArrayList<>();
		HashMap<String,Integer> suspendedList = new HashMap<>(); //<이름>
		HashMap<String,Integer> idIdx = new HashMap<String,Integer>(); //<이름, 해당 이름의 user 인덱스>
		int idx = 0;
		
		for(String name : id_List) {
			idIdx.put(name, idx++);
			users.add(new User(name));
		}
		
		for(String re : report) {
			String[] str = re.split(" ");
			users.get(idIdx.get(str[0])).reportList.add(str[1]); //내가 신고를 한 List
			users.get(idIdx.get(str[1])).reportedList.add(str[0]); //나를 신고를 한 List
		}
		
		for(User user : users) {
			if(user.reportedList.size() >=k )
				suspendedList.put(user.name,1);
		}
		
		for(User user : users) {
			for(String nameReport : user.reportList) {
				if(suspendedList.get(nameReport) != null) {
					answer[idIdx.get(user.name)]++;
				}
			}
		}
		
        return answer;
    }
	
	/*
	문제 설명
	한국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다.
	이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다.
	예를 들어, 5명의 학생이 있고, 각각의 정수 번호가 순서대로 -2, 3, 0, 2, -5일 때,
	첫 번째, 세 번째, 네 번째 학생의 정수 번호를 더하면 0이므로 세 학생은 삼총사입니다.
	또한, 두 번째, 네 번째, 다섯 번째 학생의 정수 번호를 더해도 0이므로 세 학생도 삼총사입니다.
	따라서 이 경우 한국중학교에서는 두 가지 방법으로 삼총사를 만들 수 있습니다.
	
	한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때,
	학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.
	
	제한사항
	3 ≤ number의 길이 ≤ 13
	-1,000 ≤ number의 각 원소 ≤ 1,000
	서로 다른 학생의 정수 번호가 같을 수 있습니다.
	입출력 예
	number	result
	[-2, 3, 0, 2, -5]	2
	[-3, -2, -1, 0, 1, 2, 3]	5
	[-1, 1, -1, 1]	0
	입출력 예 설명
	입출력 예 #1
	
	문제 예시와 같습니다.
	입출력 예 #2
	
	학생들의 정수 번호 쌍 (-3, 0, 3), (-2, 0, 2), (-1, 0, 1), (-2, -1, 3), (-3, 1, 2)
	이 삼총사가 될 수 있으므로, 5를 return 합니다.
	입출력 예 #3
	
	삼총사가 될 수 있는 방법이 없습니다.
	*/
}

class User{
	String name;
	HashSet<String> reportList;
	HashSet<String> reportedList;
	
	public User(String name) {
		this.name = name;
		reportList = new HashSet<>();
		reportedList= new HashSet<>();
				}

}