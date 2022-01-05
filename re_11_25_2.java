package review;
/*
 * 11월 25일 복습
 * 문자열 처리 방법
 */
public class re_11_25_2 {

	public static void main(String[] args) {
		String s = "Hello World!!";
		
		System.out.println(s+"Good");
		//문자열 연결은 +로 연결
		
		//문자열 길이 확인 방법
		System.out.println(s.length());
		//변수.length()
		//공백 포함해서 셈한다.
		
		//substring
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,5));
		//substring(값)
		//substring(값1, 값2) => 값1이상, 값2 미만
		
		//문자열 바꾸기
		System.out.println(s.replace("l", "k"));
		System.out.println(s.replaceAll("l", "k"));
		System.out.println(s.replaceFirst("l", "k"));
		//replace(값1, 값2)
		//replaceAll(값1, 값2)
		
		//인덱스 찾기
		System.out.println(s.indexOf("l")); //0번 부터 시작이니 2가나옴
		System.out.println(s.indexOf("l", 3));
		//indexOf(값)
		//indexOf(값, 숫자)
		System.out.println(s.indexOf("x"));
		//없는 것은 -1로 표현
		
		//뒤에서 인덱스 찾기
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.lastIndexOf("l", 3));
		//lastIndexOf(값)
		//lastIndexOf(값, 숫자)
		
		//한 글자만 가져올때
		System.out.println(s.charAt(6));
		//charAt(숫자)
		
		//동일한지 여부 확인
		System.out.println(s.equals("Hello?"));
		//equals(값)
		
		//문자열 더해주기
		System.out.println(s.concat("HaHa"));
		//concat(값)
		
		//문자 소문자/대문자화
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		//toLowerCase()
		//toUpperCase()
		
		//앞/뒤 공백제거
		String a = "		Hello! 			World!		";
		System.out.println(a);
		System.out.println(a.trim());
		//trim()
	}

}
