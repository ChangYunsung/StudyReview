package review;
/*
 * 12월 02일 복습
 * 숫자 클래스 Math
 * 로또번호 생성 5줄 출력하기, 1~45까지 중복없이 숫자 6개 뽑기.
 */
public class re_12_02_ex {

	public static void main(String[] args) {
		int arr [] = new int [5];
		
		arr[0] = (int)Math.floor(Math.random()*45)+1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				arr[i] = (int)Math.floor(Math.random()*45)+1;
			} 
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
