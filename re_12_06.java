package review;
/*
 * 12�� 03�� ����
 * Map
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class re_12_06 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		//HashMap�� import ���־���Ѵ�
		
		map.put("�̸�", "ȫ�浿");
		map.put("����", "11");
		// �� �߰�
		System.out.println(map.get("�̸�"));
		// Ű�� �̸��� �� �����´�
		
		System.out.println();
		map.replace("�̸�", "��ö��");
		// �� ����
		System.out.println(map.get("�̸�"));
		map.put("�̸�", "��̿�");
		// put�� �Ȱ��� �� ������ ����
		System.out.println(map.get("�̸�"));
		
		System.out.println();
		map.remove("����");
		// Ű ����
		System.out.println(map.get("����"));
		// �ش� ���� ������ null ���
		
		System.out.println();
		System.out.println(map.containsKey("�̸�"));
		System.out.println(map.containsValue("ȫ�浿"));
		// Ű�� "�̸�"�� �� ���� ���� Ȯ��
		// ���� "ȫ�浿"�� �� ���� ���� Ȯ��
		
		System.out.println();
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		// map�� ����ִ��� Ȯ��
		// map�� ����ִ� ���� Ȯ��
		
		System.out.println();
		map.put("����", "11");
		
		Set<String> keySet = map.keySet();
		//Set�� java.util�� �ִ� �� import �ʿ�
		//map�� Ű�� set���� ��ȯ
		Iterator<String> keys = keySet.iterator();
		//Iterator ���� import�� �ʿ��ϴ�
		//iterator()�� set������ �����͸� iterator ���·� ��ȯ
		
		while(keys.hasNext()) {
			//hasNext() = iterator�� ���� ����Ʈ ���� ���� �����ϴ��� ����
			String key = keys.next();
			//next() = iterator�� ���� ����Ʈ ���� ���� �����´�
			System.out.println(key + ":" + map.get(key));
		}
	}

}
