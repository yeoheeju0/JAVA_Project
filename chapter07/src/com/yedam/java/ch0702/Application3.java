package com.yedam.java.ch0702;

public class Application3 {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
		//  객체 - 뭘 참조해서 만들었는지 아는 - 타입
			Child child = (Child) parent;
			System.out.println("method1 - child 변환성공");
		} else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child 변환성공");
	}

	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method2(parentB);
		
		
		
		
		
		Driver driver = new Driver();
		
		//bus, taxi -> vehicle 부모 클래스
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//driver.drive(Vehicle vehicle = new Bus)
		driver.drive(bus);
		//driver.drive(taxi);
		
		
		//
		Animal animal = null;
		animal = new Cat();
		animal.speak();
		
		animal = new Dog();
		animal.speak();
		
		
		//
		Parent parent = new Child();
		
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "Child";
//		parent.method3();
//		
		//Casting
		Child child =(Child)parent;
	//	child.field2();
		child.method3();
		
		
		
		

	}

}
