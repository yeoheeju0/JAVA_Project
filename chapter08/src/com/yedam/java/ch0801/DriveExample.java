package com.yedam.java.ch0801;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle vhc = new Bus();
		
		vhc.run();
		//vhc.checkFare();
		
		//강제타입변환
		Bus bus2 = (Bus) vhc;
		
		bus2.run();
		bus2.checkFare();
		
		//객체타입확인
		//instanceof
		
		driver.drive(bus);
		driver.drive(taxi);
		

	}

}
