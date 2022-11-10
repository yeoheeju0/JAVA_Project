package com.yedam.java.ch06001;

public class Student {
	//필드
	//학생의 이름
	private String name;
	//학번
	private String sNo;
	//학년
	private int sYear;
	//국어, 영어, 수학 성적
	private int kor;
	private int mat;
	private int eng;
	
	//생성자
	
	public void setName(String name) {
		this.name = name;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public void setsYear(int sYear) {
		this.sYear = sYear;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public String getsNo() {
		return sNo;
	}
	public int getsYear() {
		return sYear;
	}
	public int getKor() {
		return kor;
	}
	public int getMat() {
		return mat;
	}
	public int getEng() {
		return eng;
	}
	
	//생성자
	//생성자를 통해서 모든 데이터 입력
	
	
	
	//메소드
	//getInfo() 학생의 내용을 출력 할 수 있는 기능
	
}
