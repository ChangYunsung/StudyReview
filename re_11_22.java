package review;
/*
 * 11월 22일 복습
 * 조건문
 */
public class re_11_22 {

	public static void main(String[] args) {
		int a = 2;
		
		//조건이 true인 경우
		if(a>=2) {
			System.out.println("a는 2보다 크거나 같다."); //조건 true라 실행
		}
		System.out.println("if 끝"); //if문 끝나고 실행
		
		System.out.println();
		
		//조건이 false인 경우
		if(a>=3) {
			System.out.println("a는 3보다 크거나 같다."); //조건 false라 실행 x
		}
		System.out.println("if 끝");
		
		System.out.println();
		
		//else if문
		if(a>=3) {
			System.out.println("a는 3보다 크거나 같다.");
		} else {
			System.out.println("a는 3보다 작다."); //조건 false라 실행
		}
		
		System.out.println();
		
		//else if문 2
		if(a>=3) {
			System.out.println("a는 3보다 크거나 같다."); //조건 false라 실행 x
		} else if (a==2) {
			System.out.println("a는 2와 같다"); //조건 true라 실행 
		} else {
			System.out.println("a는 1보다 작다");
		}
	}

}
