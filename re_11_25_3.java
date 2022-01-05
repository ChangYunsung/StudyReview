package review;
/*
 * 11월 25일 복습
 * 배열
 */
public class re_11_25_3 {

	public static void main(String[] args) {
		int [] arr = {1, 3, 5};
		//배열 선언
		System.out.println(arr[1]);
		//1번 인덱스 값 출력
		System.out.println();
		
		System.out.println(arr[0]);
		arr[0] = 4;
		System.out.println(arr[0]);
		//0번 인덱스 값 4로 변경
		System.out.println();
		
		System.out.println(arr.length);
		//배열의 크기
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		//배열의 크기만큼 반복문 실행하여 배열 내 값 구함
		
		System.out.println();
		
		//순차적 데이터 활용
		for(int a : arr) {
			System.out.println(a);
		}
		
		//split
		String s = "딸기,사과,포도";
		String[] arrs = s.split(",");
		System.out.println(arr.length);
		
		for(String c : arrs) {
			System.out.println(c);
		}
		//split(값)
	}
}
