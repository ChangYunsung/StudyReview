package review;
/*
 * 11월 23일 복습
 * 조건문 실습
 * 조건문을 활용하여 학점 출력.
	A = 90~100
	B = 80~89
	C = 70~79
	D = 60~69
	나머지 F
	if와 switch로 구현.
 */
import java.util.*;

public class re_11_23_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		//if문
		/*
		if(90<=score) {
			System.out.println("A");
		} else if(80<=score) {
			System.out.println("B");
		} else if(70<=score) {
			System.out.println("C");
		} else if(60<=score) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		*/
		
		switch(score/10) {
		case 1 : System.out.println("A");
		break;
		case 9 : System.out.println("A");
		break;
		case 8 : System.out.println("B");
		break;
		case 7 : System.out.println("C");
		break;
		case 6 : System.out.println("D");
		break;
		default : System.out.println("F");
		}
		//나눗셈을 하면 나머지는 나오지 않기에 나눗셈으로 값을 구한다.
			
	}
}
