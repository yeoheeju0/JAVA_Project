package com.yedam.java.example;

public class Student {
	// 각 필드를 저장 할수있는 getter, setter 작성
	// 모든 정보를 출력 할 수있는 메소드 하나 작성
	// school 클래스 만들고 main을 작성해서 정보를 넣는 프로그램
	// 학생 수 입력 받고 각 필드의 데이터를 받아와서 학생 정보가 담긴 프로그램
	// 모든 학생의 정보 출력.

	// 필드
	private String sName;
	private int sNo;
	private int kor;
	private int mat;
	private int eng;

	// 생성자

	// 메소드
	public void getInfo() {
		System.out.println("=== 입력한 학생 정보 ===");
		System.out.println("이름 : " + sName);
		System.out.println("학번 : " + sNo);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("영어 : " + eng);
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
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

	public String getsName() {
		return sName;
	}

	public int getsNo() {
		return sNo;
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
}
