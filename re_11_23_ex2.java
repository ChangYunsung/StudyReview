package review;
/*
 * 11�� 23�� ����
 * �ݺ���
 */
public class re_11_23_ex2 {

	public static void main(String[] args) {	
		//1~100���� �հ� �ݺ���
		//for��
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i; // sum = sum+i;
		}
		System.out.println(sum);
		//while��
		int i = 1;
		int hap = 0;
		while(i<=100) {
			hap+=i;
			i++;
		}
		System.out.println(hap);
		
		System.out.println();
		
		//1~100 ������ 2��� �Ǵ� 3��� ���
		for(int j=1; j<=100; j++) {
			if(j%2==0 || j%3==0) {
				System.out.println(j);
			}
		}
	}

}
