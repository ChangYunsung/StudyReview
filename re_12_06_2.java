package review;
/*
 * 12�� 03�� ����
 * Map
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class re_12_06_2 {

	public static void main(String[] args) {
		List<HashMap<String, String>>list = new ArrayList<HashMap<String, String>>();
		//����Ʈ�� ��
		
		for(int i=10; i>0; i--) {
			HashMap<String, String> data
			= new HashMap<String, String>();
			
			data.put("��ȣ", Integer.toString(i));
			data.put("����", "Test�� -"+ i);
			data.put("�ۼ���", "��ö��");
			//������ Ű,�� �Է�
			
			list.add(data);
			//����Ʈ�� ������ �� data �Է�
		}
		
		for(HashMap<String, String> data:list) {
			System.out.println(data.get("��ȣ")+
					"," + data.get("����")+
					"," + data.get("�ۼ���"));
		}
		//������ for������ ���
	
	}
}
