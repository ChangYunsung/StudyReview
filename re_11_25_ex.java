package review;
/*
 * 11�� 25�� ����
 * �������� ���� �ǽ�
 */
public class re_11_25_ex {

	public static void main(String[] args) {
		//����
		int[] arr = {5, 7, 3};
		int tmp = 0;
		//�������� ����
		//hint : if������ �� ���� �� ��Ģ�� ã�Ƽ� for�� Ȱ��
		//hint2: for�� ������ for*2, if*1
		//hint3: for�� ������ if������ �����ߴ� ������ index���� ��Ģã��
		
		//if�� �ۼ�
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
		
		//if�� ��� 2�� for�� �ۼ�
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr [i] = arr[j];
					arr [j] = tmp;
				}
			}
		}
		
		//���
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
