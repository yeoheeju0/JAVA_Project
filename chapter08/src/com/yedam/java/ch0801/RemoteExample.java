package com.yedam.java.ch0801;

public class RemoteExample {

	public static void main(String[] args) {
		
		//TV를 객체로 해서 만듦
		RemoteControl rc = new Television();
		
		//rc = new Audio(); //오디오 덮어씀
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		Search search = new Television();
		
		search.search("google.com");
		
		
//		Television tv = new Television(); //자기자신 이용해서 만든거
//		tv.turnOn();
//		tv.setVolume(11);
//		tv.turnOff();
		
		/*public void temp(RemoteControl rc) {
		  }
		  
		  public void temp(Television tv) {
		  }*/
		
		//추상클래스 VS 인터페이스
		//추상클래스(extends) -> 필드, 생성자, 메소드
		//인터페이스(implement) -> 상수, 추상메소드
		
		
	}

}
