package review;
/*
 * 12월 03일 복습
 * Map
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class re_12_06 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//HashMap은 import 해주어야한다
		
		map.put("이름", "홍길동");
		map.put("나이", "11");
		// 값 추가
		System.out.println(map.get("이름"));
		// 키가 이름인 값 가져온다
		
		System.out.println();
		map.replace("이름", "김철수");
		// 값 변경
		System.out.println(map.get("이름"));
		map.put("이름", "김미영");
		// put도 똑같이 값 변경이 가능
		System.out.println(map.get("이름"));
		
		System.out.println();
		map.remove("나이");
		// 키 제거
		System.out.println(map.get("나이"));
		// 해당 값이 없으면 null 출력
		
		System.out.println();
		System.out.println(map.containsKey("이름"));
		System.out.println(map.containsValue("홍길동"));
		// 키가 "이름"인 것 존재 유무 확인
		// 값이 "홍길동"인 것 존재 유무 확인
		
		System.out.println();
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		// map이 비어있는지 확인
		// map에 들어있는 개수 확인
		
		System.out.println();
		map.put("나이", "11");
		
		Set<String> keySet = map.keySet();
		//Set은 java.util에 있는 것 import 필요
		//map의 키를 set으로 변환
		Iterator<String> keys = keySet.iterator();
		//Iterator 역시 import가 필요하다
		//iterator()는 set형태의 데이터를 iterator 형태로 변환
		
		while(keys.hasNext()) {
			//hasNext() = iterator의 현재 포인트 다음 값이 존재하는지 여부
			String key = keys.next();
			//next() = iterator의 현재 포인트 다음 값을 가져온다
			System.out.println(key + ":" + map.get(key));
		}
	}

}
