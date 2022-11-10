package com.yedam.java;

public class Exam03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char opreator = '+';
		
		if(opreator == '+') {
//			System.out.println(num1 + num2);
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
		} else if (opreator == '-') {
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 - num2));
		} else if (opreator == '*') {
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 * num2));
		} else if(opreator == '/') {
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 / num2));
		}

	}

}
