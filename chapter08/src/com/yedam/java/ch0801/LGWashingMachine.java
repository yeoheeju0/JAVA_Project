package com.yedam.java.ch0801;

public class LGWashingMachine implements WashingMachine {

	@Override
	public void startbtn() {
		System.out.println("세탁기가 빨래를 시작.");	
	}

	@Override
	public void pausebtn() {
		System.out.println("세탁기가 빨래를 일시중지.");
	}

	@Override
	public void stopbtn() {
		System.out.println("세탁기가 빨래를 중지");
	}

	@Override
	public int changeSpeed(int speed) {
		switch(speed) {
		case 1: 
			return 20;
		case 2:
			return 50;
		case 3:
			return 100;
		}
		return 0;
	}

}
