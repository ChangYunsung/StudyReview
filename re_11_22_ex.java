package review;
/*
 * 11월 22일 복습
 * 실습
 * a=5
 * b=7
 * c=3
 * 작업을 해서 출력 a,b,c를 했을 경우
 * 출력 결과가 a는 3, b는 5, c는 7이 나와야한다.
 * a가 가장 작은 순서대로 출력
 */
public class re_11_22_ex {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 3;
		
		int tmp = 0;
		//임시로 값 저장할 변수 tmp
		
		if(a>b) {
			tmp=a; //tmp에 a값 넣음 (tmp=3)(a=0)
			a=b; //a에 b값 넣음(a=5) (b=0)
			b=tmp; //b에 tmp값 넣음(b=3)(tmp=0)
		} 
		//a가 b보다 작아야 하기 때문에
		//a가 b보다 크면 b의 값을 a에 저장
		if(a>c) {
			tmp=a;
			a=c;
			c=tmp;
		}
		//a가 c보다 작아야하기 때문에
		//a가 c보다 크면 c의 값을 a에 저장
		if(b>c) {
			tmp=b;
			b=c;
			c=tmp;
		}
		//b가 c보다 작아야하기 떄문에
		//b가 c보다 크면 c의 값을 b에 저장
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

}
