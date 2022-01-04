package review;
/*
 * 1에서 100까지 소수구하기
 */
public class re_11_24_ex3 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			int cnt = 0; // 안에다 cnt를 선언해줘야 돌때 초기화됨
			for(int j = 1; j<=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
			System.out.println(i);
			}
		}
	}
}
