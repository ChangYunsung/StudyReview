package review;
/*
 * 12월 03일 복습
 * 리스트
 */
import java.util.ArrayList;
import java.util.List;

public class re_12_03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//List 사용을 위해서는 import 필요
		
		list.add("가나다");
		//값 추가
		list.add(0, "ABC");
		//인덱스 번호 0에 ABC 추가 
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.indexOf("가나다"));
		System.out.println(list.lastIndexOf("가나다"));
		System.out.println(list.contains("ABC"));
		
		System.out.println();
		
		list.remove(0);
		System.out.println(list.get(0));
		
		System.out.println();
		
		list.set(0, "라마바");
		System.out.println(list.get(0));
		
		System.out.println();
		
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		
		System.out.println();
		
		list.clear();
		System.out.println(list.isEmpty());
		
	}

}
