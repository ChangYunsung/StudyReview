package review;
/*
 * 2~9단 구구단 출력
 */
public class re_11_24_ex4 {

	public static void main(String[] args) {
		
		for(int i = 2; i<=9; i++) { //구구단 앞자리 수 반복
			for(int j = 1; j<=9; j++) { // 구구단 뒷자리 수 반복
				System.out.println(i+"*"+j+"="+ i*j);
			}
		}
	}
}
