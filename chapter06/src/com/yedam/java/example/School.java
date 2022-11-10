package com.yedam.java.example;

import java.util.Scanner;

public class School {

	int[] ary = new int[6];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" 학생의 수> ");
		int Scount = Integer.parseInt(sc.nextLine());
		Student[] Sary = new Student[Scount];

		for (int i = 0; i < Sary.length; i++) {
			Student student = new Student();

			System.out.println("이름 > ");
			String sName = sc.nextLine(); //문자
			student.setsName(sName);

			System.out.println("학번 >");
			int sNo = Integer.parseInt(sc.nextLine()); //숫자
			student.setsNo(sNo);
			
			System.out.println("국어 >");
			int kor = Integer.parseInt(sc.nextLine());
			student.setKor(kor);

			System.out.println("수학 >");
			int mat = Integer.parseInt(sc.nextLine());
			student.setMat(mat);
			
			System.out.println("영어 >");
			int eng = Integer.parseInt(sc.nextLine());
			student.setEng(eng);
			
			Sary[i] = student;
		}
		for (int i = 0; i < Sary.length; i++) {
			Sary[i].getInfo();
			
	//System.out.println("학생이름 > " + Sary[i].getsName());
		}
		
	}
}
