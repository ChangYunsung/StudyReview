package review;
/*
 * 11�� 25�� ����
 * �迭
 */
public class re_11_25_3 {

	public static void main(String[] args) {
		int [] arr = {1, 3, 5};
		//�迭 ����
		System.out.println(arr[1]);
		//1�� �ε��� �� ���
		System.out.println();
		
		System.out.println(arr[0]);
		arr[0] = 4;
		System.out.println(arr[0]);
		//0�� �ε��� �� 4�� ����
		System.out.println();
		
		System.out.println(arr.length);
		//�迭�� ũ��
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		//�迭�� ũ�⸸ŭ �ݺ��� �����Ͽ� �迭 �� �� ����
		
		System.out.println();
		
		//������ ������ Ȱ��
		for(int a : arr) {
			System.out.println(a);
		}
		
		//split
		String s = "����,���,����";
		String[] arrs = s.split(",");
		System.out.println(arr.length);
		
		for(String c : arrs) {
			System.out.println(c);
		}
		//split(��)
	}
}
