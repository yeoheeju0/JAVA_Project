package com.yedam.java.ch0703;

public class Application {
	public static void main(String[] args) {

//		Phone phone = new Phone("아이폰");
		
//		SmartPhone smartphone = new SmartPhone("고길동");
//		
//		SmartPhone.turnOn();
//		SmartPhone.internetSearch();
//		SmartPhone.turnOff();
//		
		//
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("----------------");
		
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal.breathe();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("----------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
