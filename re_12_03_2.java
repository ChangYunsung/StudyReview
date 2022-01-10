package review;
/*
 * 12월 03일 복습
 * 리스트
 */
import java.util.ArrayList;
import java.util.List;

public class re_12_03_2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("가나다");
		list.add("라마바");
		list.add("사아자");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//for문을 통한 list 내용 출력
		
		System.out.println();
		
		for(String s : list) {
			System.out.println(s);
		}
		//for문 순차적 데이터 통한 내용 출력
	}

}
