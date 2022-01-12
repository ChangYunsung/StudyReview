package review;
/*
 * 12월 03일 복습
 * Map
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class re_12_06_2 {

	public static void main(String[] args) {
		List<HashMap<String, String>>list = new ArrayList<HashMap<String, String>>();
		//리스트로 맵
		
		for(int i=10; i>0; i--) {
			HashMap<String, String> data
			= new HashMap<String, String>();
			
			data.put("번호", Integer.toString(i));
			data.put("제목", "Test중 -"+ i);
			data.put("작성자", "김철수");
			//맵으로 키,값 입력
			
			list.add(data);
			//리스트에 맵으로 된 data 입력
		}
		
		for(HashMap<String, String> data:list) {
			System.out.println(data.get("번호")+
					"," + data.get("제목")+
					"," + data.get("작성자"));
		}
		//순차적 for문으로 출력
	
	}
}
