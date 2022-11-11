package com.yedam.java.ch0702;

public class Application4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		//c -> b 상속관계 자 -> 부
		//b -> a 상속관계
		//c -> b -> a 상속관계 손 -> 아 -> 할
		
		A a1 = b;
		A a2 = c; //(c->a) c에 오버라이딩 되어있는거 사용가능
	}

	
}
