package review;
/*
 * 12�� 03�� ����
 * ����Ʈ
 */
import java.util.ArrayList;
import java.util.List;

public class re_12_03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//List ����� ���ؼ��� import �ʿ�
		
		list.add("������");
		//�� �߰�
		list.add(0, "ABC");
		//�ε��� ��ȣ 0�� ABC �߰� 
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.indexOf("������"));
		System.out.println(list.lastIndexOf("������"));
		System.out.println(list.contains("ABC"));
		
		System.out.println();
		
		list.remove(0);
		System.out.println(list.get(0));
		
		System.out.println();
		
		list.set(0, "�󸶹�");
		System.out.println(list.get(0));
		
		System.out.println();
		
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		
		System.out.println();
		
		list.clear();
		System.out.println(list.isEmpty());
		
	}

}
