package review;
/*
 * 11월 29일 복습
 * Scanner
 */
import java.util.Scanner;
public class re_11_29_2_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//system.out은 출력, system.in은 입력받는 것.
		//nextLine() : 한줄을 입력받는다. 입력이 완료될 때까지 대기상태.
		//			   엔터가 들어갔느냐에 따라서 라인 구별을 함.
		String s = sc.nextLine();
		
		System.out.println("입력값 :" + s);
		
		int a = sc.nextInt();
		sc.nextLine(); //이렇게 nextLine을 입력해주는게 나음
		System.out.println("입력값 :" + a);
		//nextInt() : 입력된 숫자를 정수로 받는다. (띄어쓰기로 구분)
		
		String s2 = sc.nextLine();
		System.out.println("입력값 :" + s2);
		//nextInt로 숫자를 뽑아와서 엔터가 남아 처리를 안한 상태가 됨.
		//next() : 입력된 문자열 단어를 받는다. 띄어쓰기로 구분.
		
	}

}
