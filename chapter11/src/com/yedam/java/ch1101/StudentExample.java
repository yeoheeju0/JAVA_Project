package com.yedam.java.ch1101;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {

		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashmap = new HashMap<Student, String>();
		
		//new Student("1")의 점수 95를 저장
		hashmap.put(new Student("1"), "95");
		
		//new Student("1")로 점수를 읽어옴
		String score = hashmap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : " + score);
	}
}
