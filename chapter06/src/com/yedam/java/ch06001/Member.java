package com.yedam.java.ch06001;

public class Member {
	//필드
	private String id;
	private String tel;
	private int age;
	
	//생성자
	
	//메소드
	//provate String id;
	public String getId() {
		//원본 데이터(yedam)
		//yedam님 입니다.
		//id += "님 입니다."; 
		return id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int age() {
		return age;
	}
	public void setAge(int age) {
		if(age <=0) {
			System.out.println("0보다 작은 나이가 저장되었습니다. 다시 확인하세요.");
			return;
		} else {
			this.age = age;
		}
	}
	
}
