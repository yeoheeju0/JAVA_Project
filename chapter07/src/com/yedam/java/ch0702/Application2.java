package com.yedam.java.ch0702;

public class Application2 {

	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire kTire = new KumhoTire("left", 20);
		
		//Tire 객체에 자식객체인 hTire
		//tire -> 한국타이어를 사용하고 있다.
		Tire tire = hTire;
		System.out.println(tire.roll());
		
		tire = kTire;
		System.out.println(tire.roll());
		
		tire = hTire;
		System.out.println(tire.roll());
		

	}

}
