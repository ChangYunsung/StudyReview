package review;
/*
 * 11월 29일 복습
 * 다차원 배열
 */
public class re_11_29 {

	public static void main(String[] args) {
		//2차원 배열 선언
		int[][]arr = {{1, 3, 5}, {2, 4, 6}};
		//배열의 길이
		System.out.println(arr.length);
		//배열안의 배열0 길이
		System.out.println(arr[0].length);
		
		System.out.println();
		System.out.println(arr[0]);
		//배열을 보관하는 메모리 주소 출력
		
		for(int i=0; i<arr.length; i++) { //큰 방의 길이
			for(int j=0; j<arr[i].length; j++) { //작은 방의 길이
				System.out.print(arr[i][j] + " ");
			} System.out.println();
			
		}
	}

}
