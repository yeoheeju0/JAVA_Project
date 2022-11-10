package com.yedam.java.ch0604;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	void poweroff() {
		System.out.println("전원을 끕니다.");
	}

	///
	double avg(int x, int y) {
		int sum = plus(x, y);
		double result = sum / 2.0;
		return result;
	}

	void execute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}

	void println(String message) {
		System.out.println(message);
	}
	
	//사각형 넓이구하기
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
