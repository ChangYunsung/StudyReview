package review;
/*
 * 11�� 29�� ����
 * Scanner
 */
import java.util.Scanner;
public class re_11_29_2_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//system.out�� ���, system.in�� �Է¹޴� ��.
		//nextLine() : ������ �Է¹޴´�. �Է��� �Ϸ�� ������ ������.
		//			   ���Ͱ� �����Ŀ� ���� ���� ������ ��.
		String s = sc.nextLine();
		
		System.out.println("�Է°� :" + s);
		
		int a = sc.nextInt();
		sc.nextLine(); //�̷��� nextLine�� �Է����ִ°� ����
		System.out.println("�Է°� :" + a);
		//nextInt() : �Էµ� ���ڸ� ������ �޴´�. (����� ����)
		
		String s2 = sc.nextLine();
		System.out.println("�Է°� :" + s2);
		//nextInt�� ���ڸ� �̾ƿͼ� ���Ͱ� ���� ó���� ���� ���°� ��.
		//next() : �Էµ� ���ڿ� �ܾ �޴´�. ����� ����.
		
	}

}
