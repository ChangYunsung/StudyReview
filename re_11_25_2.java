package review;
/*
 * 11�� 25�� ����
 * ���ڿ� ó�� ���
 */
public class re_11_25_2 {

	public static void main(String[] args) {
		String s = "Hello World!!";
		
		System.out.println(s+"Good");
		//���ڿ� ������ +�� ����
		
		//���ڿ� ���� Ȯ�� ���
		System.out.println(s.length());
		//����.length()
		//���� �����ؼ� ���Ѵ�.
		
		//substring
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,5));
		//substring(��)
		//substring(��1, ��2) => ��1�̻�, ��2 �̸�
		
		//���ڿ� �ٲٱ�
		System.out.println(s.replace("l", "k"));
		System.out.println(s.replaceAll("l", "k"));
		System.out.println(s.replaceFirst("l", "k"));
		//replace(��1, ��2)
		//replaceAll(��1, ��2)
		
		//�ε��� ã��
		System.out.println(s.indexOf("l")); //0�� ���� �����̴� 2������
		System.out.println(s.indexOf("l", 3));
		//indexOf(��)
		//indexOf(��, ����)
		System.out.println(s.indexOf("x"));
		//���� ���� -1�� ǥ��
		
		//�ڿ��� �ε��� ã��
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.lastIndexOf("l", 3));
		//lastIndexOf(��)
		//lastIndexOf(��, ����)
		
		//�� ���ڸ� �����ö�
		System.out.println(s.charAt(6));
		//charAt(����)
		
		//�������� ���� Ȯ��
		System.out.println(s.equals("Hello?"));
		//equals(��)
		
		//���ڿ� �����ֱ�
		System.out.println(s.concat("HaHa"));
		//concat(��)
		
		//���� �ҹ���/�빮��ȭ
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		//toLowerCase()
		//toUpperCase()
		
		//��/�� ��������
		String a = "		Hello! 			World!		";
		System.out.println(a);
		System.out.println(a.trim());
		//trim()
	}

}
