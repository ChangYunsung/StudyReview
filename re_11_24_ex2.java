package review;
/*
 * �Ҽ����ϱ�
 * ���� �� �Ҽ����ϱ�
 */
import java.util.*;
public class re_11_24_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++; // �� ���� ī��Ʈ
			}
		}
		if(cnt == 2) { //�Ҽ��� ���� �ڱ� �ڽ�, 1�̱⿡ �� ������ 2��
			System.out.println("�Ҽ�");
		} else {
			System.out.println("�Ҽ��� �ƴ�");
		}
	}
}
