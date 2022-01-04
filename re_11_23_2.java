package review;
/*
 * 11월 23일 복습
 * 더하기의 법칙
 */
public class re_11_23_2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String c = "30";
		
		System.out.println(a+b+c); //숫자+숫자+문자열
		System.out.println(a+(b+c)); //숫자+(숫자+문자열) => 숫자+문자열
		System.out.println(c+a+b); //문자열+숫자+숫자 
	}

}
