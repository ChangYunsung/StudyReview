package review;
/*
 * 11�� 29�� ����
 * Scanner �ǽ�
 */
import java.util.Scanner;
public class re_11_29_ex2 {
	/*
	 * ����ö 1.�̵� 2.����
	 * �Է��ؼ� 1 �Է��ϸ� �̵��մϴ� ���
	 * 2 �Է��ϸ� ����
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("����ö�� ���Ű��� ȯ���մϴ�.");
	
	while(true) {
		System.out.println("1.�̵� 2.����");
			int a = sc.nextInt();
			if(a==1) {
				System.out.println("�̵��մϴ�.");
			} else if(a==2){
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}

