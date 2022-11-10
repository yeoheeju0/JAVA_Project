package com.yedam.java.ch06001;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("최대 스피드 : " + car1.maxSpeed);
		System.out.println("색깔 : " + car1.color);
		car1.run();
		
		Car car2 = new Car();
		System.out.println("최대 스피드 : " + car2.maxSpeed);
		System.out.println("색깔 : " + car2.color);
		car2.run();
		
		System.out.println();  //
		
		if(car1 == car2) {
			System.out.println("car1과car2는 동일한 객체를 참조합니다.");
		} else {
			System.out.println("car1과car2는 서로 다른 객체를 참조합니다.");
		}
	}

}
