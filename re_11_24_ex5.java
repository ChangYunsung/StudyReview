package review;
/*
 * 별찍기
 */
public class re_11_24_ex5 {

	public static void main(String[] args) {
		/*
		for(int i=0; i<=4; i++) { //4줄 행
			for(int j=0; j<=i; j++) { //열
				System.out.print("*");
			} System.out.println();
		} //정방향 별찍기
		*/
		System.out.println();
		
		for(int i=0; i<=4; i++) { //4줄 행
			for(int j=4; j==i; j--) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
