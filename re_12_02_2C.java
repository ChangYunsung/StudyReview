package review;
/*
 * 12월 02일 복습
 * 상속
 */
public class re_12_02_2C extends re_12_02_2P {
	//re_12_02_2C는 re_12_02_2P를 상속받고 있다
	String s = "자식변수";
	
	public String getPs() {
		return super.s;
		//super 부모 클래스
		//부모클래스에 있는 s를 가져온다
	}

}
