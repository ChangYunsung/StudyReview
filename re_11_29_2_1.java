package review;
/*
 * 11월 29일 복습
 * 클래스
 */
public class re_11_29_2_1 {
	/*
	//메인이 없는 클래스 생성
	public String s = "Hello";
	
	public re_11_29_2_1() {
		System.out.println("기본 생성자 호출");
	} //생성자
	
	public re_11_29_2_1(String str) {
		System.out.println("추가 생성자 호출 :" + str);
	}
	*/
	public void test() {
		System.out.println("테스트 메소드 실행");
	} //반환 타입 없는 메소드 생성
	
	public int intPlus(int a, int b) {
		//반환 타입이 int => 정수를 반환해야한다.
		//실행햐라면 정수 2개를 주어야 실행 가능
		return a+b;
		//a와 b를 더해서 반환한다
	}
}
