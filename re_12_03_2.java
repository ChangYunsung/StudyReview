package review;
/*
 * 12�� 03�� ����
 * ����Ʈ
 */
import java.util.ArrayList;
import java.util.List;

public class re_12_03_2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("������");
		list.add("�󸶹�");
		list.add("�����");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//for���� ���� list ���� ���
		
		System.out.println();
		
		for(String s : list) {
			System.out.println(s);
		}
		//for�� ������ ������ ���� ���� ���
	}

}
