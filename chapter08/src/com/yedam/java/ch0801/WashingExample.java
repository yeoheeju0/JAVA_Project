package com.yedam.java.ch0801;

public class WashingExample {

	public static void main(String[] args) {

		washing(new LGWashingMachine());
//		WashingMachine wm = new LGWashingMachine();
//		wm.startbtn();
//		
//		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
//		wm.stopbtn();
	}

	public static void washing(WashingMachine wm) {
		wm.startbtn();
		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
		wm.stopbtn();
	}

}
