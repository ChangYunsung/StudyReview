package review;
/*
 * 11�� 22�� ����
 * �ǽ�
 * a=5
 * b=7
 * c=3
 * �۾��� �ؼ� ��� a,b,c�� ���� ���
 * ��� ����� a�� 3, b�� 5, c�� 7�� ���;��Ѵ�.
 * a�� ���� ���� ������� ���
 */
public class re_11_22_ex {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 3;
		
		int tmp = 0;
		//�ӽ÷� �� ������ ���� tmp
		
		if(a>b) {
			tmp=a; //tmp�� a�� ���� (tmp=3)(a=0)
			a=b; //a�� b�� ����(a=5) (b=0)
			b=tmp; //b�� tmp�� ����(b=3)(tmp=0)
		} 
		//a�� b���� �۾ƾ� �ϱ� ������
		//a�� b���� ũ�� b�� ���� a�� ����
		if(a>c) {
			tmp=a;
			a=c;
			c=tmp;
		}
		//a�� c���� �۾ƾ��ϱ� ������
		//a�� c���� ũ�� c�� ���� a�� ����
		if(b>c) {
			tmp=b;
			b=c;
			c=tmp;
		}
		//b�� c���� �۾ƾ��ϱ� ������
		//b�� c���� ũ�� c�� ���� b�� ����
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

}
