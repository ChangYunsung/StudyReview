package review;
/*
 * 11�� 23�� ����
 * �Ǻ���ġ ����
 * �Ǻ���ġ ���� 10��
 * 1 1 2 3 5 8 13
 * ���� 1���� ����
 * ���� 0���� ����
 */
public class re_11_24_ex {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		int tmp = 0;
		
		for(int i = 1; i<=10; i++) {
			System.out.println(a);
			sum = tmp;
			tmp = a;
			a = a+sum;
		/*
		 *  a	1	1	2	3
			sum	0	1	1	2
			tmp	1	1	2	3
		  a+sum	1	2	3	5
		 */
		}
		
	}
}
