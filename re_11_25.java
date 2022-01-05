package review;
/*
 * 11월 25일 복습
 * 기본 자료형 형 변환
 */
public class re_11_25 {

	public static void main(String[] args) {
		//숫자 => 숫자
		int a = 7;
		System.out.println((float)a);
		//(바뀔타입)값;
		
		//숫자 => 문자열
		System.out.println(Integer.toString(a)+2);
		//type클래스.toString(값)
		
		//문자열 => 숫자
		System.out.println(Integer.parseInt("7")+2);
		//type클래스.parse타입(값)
	}

}
