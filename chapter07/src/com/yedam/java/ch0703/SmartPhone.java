package com.yedam.java.ch0703;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("검색을 합니다.");
	}
}
