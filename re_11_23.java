package review;
/*
 * 11�� 23�� ����
 * ���ǹ�
 */
public class re_11_23 {

	public static void main(String[] args) {
		int a = 10;
		
		switch(a) {
		case 10 : System.out.println("a�� 10�Դϴ�.");
		case 20 : System.out.println("a�� 20�Դϴ�.");
		case 30 : System.out.println("a�� 30�Դϴ�.");
		default : System.out.println("a�� �ƹ��͵� �ƴմϴ�.");
		}//a�� ���� 10�̰� break�� ���⿡ �ؿ� �ִ� ������� �� ����
		
		System.out.println();
		switch(a) {
		case 10 : System.out.println("a�� 10�Դϴ�.");
		break;
		case 20 : System.out.println("a�� 20�Դϴ�.");
		break;
		case 30 : System.out.println("a�� 30�Դϴ�.");
		break;
		default : System.out.println("a�� �ƹ��͵� �ƴմϴ�.");
		}//break�� �ɸ��⿡ a���� �´� ������ ��	
	}

}
