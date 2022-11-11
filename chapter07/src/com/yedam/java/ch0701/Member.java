package com.yedam.java.ch0701;

public class Member extends People {

	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn); //부모 클래스 생성자 (People)
		this.stdNo = stdNo;
	}
}
