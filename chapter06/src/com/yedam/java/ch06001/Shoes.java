package com.yedam.java.ch06001;

public class Shoes {
	static int totalCount;
	
	int running;
	int slipper;
	int mule;
	
	void makeRunning() {
		running += 1;
	}
	void makeslipper() {
		slipper += 1;
	}
	void makemule() {
		mule += 1;
	}
	void getCount() {
		totalCount = running + slipper + mule;
	}
		
	
	
}
