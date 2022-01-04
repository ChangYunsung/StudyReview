package review;
/*
 * 소수구하기
 * 검증 수 소수구하기
 */
import java.util.*;
public class re_11_24_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++; // 몫 개수 카운트
			}
		}
		if(cnt == 2) { //소수는 몫이 자기 자신, 1이기에 몫 개수는 2개
			System.out.println("소수");
		} else {
			System.out.println("소수가 아님");
		}
	}
}
