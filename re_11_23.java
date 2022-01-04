package review;
/*
 * 11월 23일 복습
 * 조건문
 */
public class re_11_23 {

	public static void main(String[] args) {
		int a = 10;
		
		switch(a) {
		case 10 : System.out.println("a는 10입니다.");
		case 20 : System.out.println("a는 20입니다.");
		case 30 : System.out.println("a는 30입니다.");
		default : System.out.println("a는 아무것도 아닙니다.");
		}//a의 값이 10이고 break가 없기에 밑에 있는 내용들이 다 실행
		
		System.out.println();
		switch(a) {
		case 10 : System.out.println("a는 10입니다.");
		break;
		case 20 : System.out.println("a는 20입니다.");
		break;
		case 30 : System.out.println("a는 30입니다.");
		break;
		default : System.out.println("a는 아무것도 아닙니다.");
		}//break가 걸리기에 a값이 맞는 곳에서 끝	
	}

}
