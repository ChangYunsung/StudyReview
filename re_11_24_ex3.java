package review;
/*
 * 1���� 100���� �Ҽ����ϱ�
 */
public class re_11_24_ex3 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			int cnt = 0; // �ȿ��� cnt�� ��������� ���� �ʱ�ȭ��
			for(int j = 1; j<=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
			System.out.println(i);
			}
		}
	}
}
