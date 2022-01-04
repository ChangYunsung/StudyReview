package review;
/*
 * 11월 23일 복습
 * 반복문
 */
public class re_11_23_ex2 {

	public static void main(String[] args) {	
		//1~100까지 합계 반복문
		//for문
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i; // sum = sum+i;
		}
		System.out.println(sum);
		//while문
		int i = 1;
		int hap = 0;
		while(i<=100) {
			hap+=i;
			i++;
		}
		System.out.println(hap);
		
		System.out.println();
		
		//1~100 사이의 2배수 또는 3배수 출력
		for(int j=1; j<=100; j++) {
			if(j%2==0 || j%3==0) {
				System.out.println(j);
			}
		}
	}

}
