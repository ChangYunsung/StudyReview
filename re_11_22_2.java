package review;
/*
 * 11월 22일 복습
 * 변수, 연산
 */
public class re_11_22_2 {

	public static void main(String[] args) {
		//변수
		System.out.println("Hello World!");
		//정수형 생성
		int a = 7;
		//정수 7을 정수형 변수 a에 넣어준다
		float b = 1.7f;
		//실수 1.7을 실수형 변수 b에 넣어준다
		//float 사용 시 값 뒤에 f를 넣어주어야한다.
		boolean c = true;
		//true 값을 논리형(=질의형) 변수 c에 입력 
		char d = 'a';
		//문자형 a를 문자형 변수 d에 넣어준다
		String e = "abc";
		//문자열 abc를 문자열 변수 e에 넣어준다
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		//출력
		
		System.out.println();
		//사칙연산
		int a1 = 5;
		int a2 = 3;
		System.out.println(a1+a2);
		System.out.println(a1-a2);
		System.out.println(a1*a2);
		System.out.println(a1/a2);
		System.out.println(a1%a2); //%는 나머지
		
		System.out.println();
		//비교연산
		
		System.out.println(a1>a2);
		System.out.println(a1>=a2);
		System.out.println(a1<a2);
		System.out.println(a1<=a2);
		System.out.println(a1==a2);
		System.out.println(a1!=a2);
		//비교연산은 true, false로 값이 나온다.
		
		System.out.println();
		//증감연산
		int s = 1;
		System.out.println(s+=1); // s=s+1
		System.out.println(s-=1); // s=s-1
		System.out.println(s*=1); // s=s*1
		System.out.println(s/=1); // s=s/1
		System.out.println(s%=1); // s=s%1
		
		System.out.println();
		//증감연산2
		int x = 3;
		System.out.println(x++); //++가 뒤에 있으므로 출력 후 1증가 (3출력)(4저장)
		System.out.println(++x); //++가 앞에 있으므로 출력 전 1증가 (5출력)(5저장)
		System.out.println(x--); //--가 뒤에 있으므로 출력 후 1감소 (5출력)(4저장)
		System.out.println(--x); //--가 앞에 있으므로 출력 전 1증가 (3출력)(3저장)
	}

}
