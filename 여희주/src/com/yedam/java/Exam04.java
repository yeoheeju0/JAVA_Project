package com.yedam.java;

public class Exam04 {

	public static void main(String[] args) {
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				System.out.println(" ");
			} 
			System.out.println();
		}
	}

}
