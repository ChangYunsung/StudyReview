package review;
/*
 * 11월 23일 복습
 * 피보나치 수열
 * 피보나치 수열 10건
 * 1 1 2 3 5 8 13
 * 수는 1부터 시작
 * 합은 0부터 시작
 */
public class re_11_24_ex {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		int tmp = 0;
		
		for(int i = 1; i<=10; i++) {
			System.out.println(a);
			sum = tmp;
			tmp = a;
			a = a+sum;
		/*
		 *  a	1	1	2	3
			sum	0	1	1	2
			tmp	1	1	2	3
		  a+sum	1	2	3	5
		 */
		}
		
	}
}
