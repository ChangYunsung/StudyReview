package review;
/*
 * 11월 29일 복습
 * Scanner 실습
 */
import java.util.Scanner;
public class re_11_29_ex2 {
	/*
	 * 지하철 1.이동 2.종료
	 * 입력해서 1 입력하면 이동합니다 출력
	 * 2 입력하면 종료
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("지하철에 오신것을 환영합니다.");
	
	while(true) {
		System.out.println("1.이동 2.종료");
			int a = sc.nextInt();
			if(a==1) {
				System.out.println("이동합니다.");
			} else if(a==2){
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}

