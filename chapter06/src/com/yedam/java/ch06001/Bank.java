package com.yedam.java.ch06001;

public class Bank {
	public static final double INTEREST_RATE =0.03;
}
//은행 고객 정보를 관리하는 클래스
		//1.main 2.Customer 3. Bank
		//1)main -> 생성자를 통한 고객의 정보를 저장, 출력
		//2)Bank -> 해당은행의 금리의 저장
		// (현재 잔액 + (현재 잔액 * 금리))
		//3)Customer -> 고객의 정보를 저장
		//이름, 은행명, 계좌, 잔액의 필드
		//getInfo() : 입력한 정보를 출력
		//withDraw() : 출금 할때 정보를 출력