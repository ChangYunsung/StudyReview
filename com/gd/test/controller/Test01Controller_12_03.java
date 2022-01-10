/*
 * 12월 03일 복습
 * 패키지
 */
package com.gd.test.controller;
//패키지에 대한 정보 명시
import com.gd.test.service.*;
//import는 주소록과 같다. 해당 파일이 어디있는지를 가져온다.
//*는 패키지 내의 모든 것들을 가져오게 한다

public class Test01Controller_12_03 {

	public static void main(String[] args) {
		Test01Service_12_03 ts = new Test01Service_12_03();
		//Test01Service_12_03는 같은 패키지 내에 없기 때문에
		//import를 해 줘야 한다
	}

}
