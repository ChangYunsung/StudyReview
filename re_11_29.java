package review;
/*
 * 11�� 29�� ����
 * ������ �迭
 */
public class re_11_29 {

	public static void main(String[] args) {
		//2���� �迭 ����
		int[][]arr = {{1, 3, 5}, {2, 4, 6}};
		//�迭�� ����
		System.out.println(arr.length);
		//�迭���� �迭0 ����
		System.out.println(arr[0].length);
		
		System.out.println();
		System.out.println(arr[0]);
		//�迭�� �����ϴ� �޸� �ּ� ���
		
		for(int i=0; i<arr.length; i++) { //ū ���� ����
			for(int j=0; j<arr[i].length; j++) { //���� ���� ����
				System.out.print(arr[i][j] + " ");
			} System.out.println();
			
		}
	}

}
