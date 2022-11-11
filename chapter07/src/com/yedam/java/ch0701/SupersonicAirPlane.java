package com.yedam.java.ch0701;

public class SupersonicAirPlane extends AirPlane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행모드 입니다.");
		} else {
			super.fly();
		}
	}

	public void test() {
		super.fly(); //부모클래스에 있는거 강제로 끌고옴
	}
	
}
