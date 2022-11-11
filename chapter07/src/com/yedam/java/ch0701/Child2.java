package com.yedam.java.ch0701;

import com.yedam.java.ch07.Parent;

public class Child2 extends Parent {

	//필드
	
	//생성자
	
	//메소드
	void getInfo() { //protected 사용하면 다른 패키지에 있는거 사용가능
		             //조건 안걸고 할려면 public
		System.out.println(firstName + lastName + bloodType + age);
	}
	
}
