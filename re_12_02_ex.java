package review;
/*
 * 12�� 02�� ����
 * ���� Ŭ���� Math
 * �ζǹ�ȣ ���� 5�� ����ϱ�, 1~45���� �ߺ����� ���� 6�� �̱�.
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
