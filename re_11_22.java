package review;
/*
 * 11�� 22�� ����
 * ���ǹ�
 */
public class re_11_22 {

	public static void main(String[] args) {
		int a = 2;
		
		//������ true�� ���
		if(a>=2) {
			System.out.println("a�� 2���� ũ�ų� ����."); //���� true�� ����
		}
		System.out.println("if ��"); //if�� ������ ����
		
		System.out.println();
		
		//������ false�� ���
		if(a>=3) {
			System.out.println("a�� 3���� ũ�ų� ����."); //���� false�� ���� x
		}
		System.out.println("if ��");
		
		System.out.println();
		
		//else if��
		if(a>=3) {
			System.out.println("a�� 3���� ũ�ų� ����.");
		} else {
			System.out.println("a�� 3���� �۴�."); //���� false�� ����
		}
		
		System.out.println();
		
		//else if�� 2
		if(a>=3) {
			System.out.println("a�� 3���� ũ�ų� ����."); //���� false�� ���� x
		} else if (a==2) {
			System.out.println("a�� 2�� ����"); //���� true�� ���� 
		} else {
			System.out.println("a�� 1���� �۴�");
		}
	}

}
