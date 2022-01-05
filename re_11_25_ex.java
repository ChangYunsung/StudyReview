package review;
/*
 * 11월 25일 복습
 * 오름차순 정렬 실습
 */
public class re_11_25_ex {

	public static void main(String[] args) {
		//선언
		int[] arr = {5, 7, 3};
		int tmp = 0;
		//오름차순 정렬
		//hint : if만으로 선 구현 후 규칙을 찾아서 for문 활용
		//hint2: for문 구현시 for*2, if*1
		//hint3: for문 구현시 if만으로 구현했던 내용의 index에서 규칙찾기
		
		//if문 작성
		/*
		if(arr[0] > arr[1]) {
			tmp = arr[0];
			arr[0] = arr[1];
			arr[1] = tmp;
		}
		if(arr[0] > arr[2]) {
			tmp = arr[0];
			arr[0] = arr[2];
			arr[2] = tmp;
		}
		if(arr[1] > arr[2]) {
			tmp = arr[1];
			arr[1] = arr[2];
			arr[2] = tmp;
		}
		*/
		
		//if문 기반 2중 for문 작성
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr [i] = arr[j];
					arr [j] = tmp;
				}
			}
		}
		
		//출력
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
