package review;
/*
 * 11�� 22�� ����
 * ����, ����
 */
public class re_11_22_2 {

	public static void main(String[] args) {
		//����
		System.out.println("Hello World!");
		//������ ����
		int a = 7;
		//���� 7�� ������ ���� a�� �־��ش�
		float b = 1.7f;
		//�Ǽ� 1.7�� �Ǽ��� ���� b�� �־��ش�
		//float ��� �� �� �ڿ� f�� �־��־���Ѵ�.
		boolean c = true;
		//true ���� ����(=������) ���� c�� �Է� 
		char d = 'a';
		//������ a�� ������ ���� d�� �־��ش�
		String e = "abc";
		//���ڿ� abc�� ���ڿ� ���� e�� �־��ش�
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		//���
		
		System.out.println();
		//��Ģ����
		int a1 = 5;
		int a2 = 3;
		System.out.println(a1+a2);
		System.out.println(a1-a2);
		System.out.println(a1*a2);
		System.out.println(a1/a2);
		System.out.println(a1%a2); //%�� ������
		
		System.out.println();
		//�񱳿���
		
		System.out.println(a1>a2);
		System.out.println(a1>=a2);
		System.out.println(a1<a2);
		System.out.println(a1<=a2);
		System.out.println(a1==a2);
		System.out.println(a1!=a2);
		//�񱳿����� true, false�� ���� ���´�.
		
		System.out.println();
		//��������
		int s = 1;
		System.out.println(s+=1); // s=s+1
		System.out.println(s-=1); // s=s-1
		System.out.println(s*=1); // s=s*1
		System.out.println(s/=1); // s=s/1
		System.out.println(s%=1); // s=s%1
		
		System.out.println();
		//��������2
		int x = 3;
		System.out.println(x++); //++�� �ڿ� �����Ƿ� ��� �� 1���� (3���)(4����)
		System.out.println(++x); //++�� �տ� �����Ƿ� ��� �� 1���� (5���)(5����)
		System.out.println(x--); //--�� �ڿ� �����Ƿ� ��� �� 1���� (5���)(4����)
		System.out.println(--x); //--�� �տ� �����Ƿ� ��� �� 1���� (3���)(3����)
	}

}
