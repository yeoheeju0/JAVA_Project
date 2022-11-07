package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("삼품의 가격:%d원\n", value);
		System.out.printf("삼품의 가격:%6d원\n", value);
		System.out.printf("삼품의 가격:%-6d원\n", value); //왼쪽부터
		System.out.printf("삼품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

		Scanner sc = new Scanner(System.in);
		
//		String = sc.nextLine();
//		String str = sc.next();
//		int var = sc.nextInt();
		
//		int x =sc.nextInt();
//		int y =sc.nextInt();
//		System.out.println("입력 : " + (x+y));
		
		/*System.out.print("첫번째 : ");
		String x = sc.nextLine();
		System.out.print("두번째 : ");
		String y = sc.nextLine();
		int result = Integer.parseInt(x) + Integer.parseInt(y);
		System.out.print("결과 : " + result);*/
		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
