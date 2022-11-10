package com.yedam.java.ch0603;

public class Car {
	//필드
	 String company = "현대자동차";
	 String model = "그랜저";
	 String color = "검정";
	 int maxspeed  = 350;
	 int speed;
	
	
	//생성자
//	public Car(String model, String color) {
//		this.model = model; //this -> 필드
//		this.color = color;
		
	//}
	
	public Car() { } 
	
	public Car(String model) {
		//this.model = model;
		this(model, "은색", 250);
	}
	
	public Car(String model, String color) { 
		//this.model = model; 
		//this.color = color;
		this(model, color, 250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model; 
		this.color = color;
		this.maxspeed = maxSpeed;
	}
	
}
