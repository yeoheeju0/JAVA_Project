package com.yedam.java.ch0402;

import java.util.Scanner;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// 문제1 책 161페이지 5번
		// for문을 이용해서 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		for (int i = 1; i <= 5; i++) { // line
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // 한글자씩 출력
//				if(i == j)
//				String tree = "";
//				for(int i = 1; i <= 5; i++) {
//					tree += "*";
//					System.out.println(tree);
			}
			System.out.println();
		}
		//반대
		//   * 1번째줄, 공백 3개, 별 1개
		//  ** 2번째줄, 공백 2개, 별 2개
		// *** 3번째줄, 공백 1개, 별 3개
		//**** 4번째줄, 공백 0개, 별 4개
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j <= (4-i)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 문제2 for문을 이용해서 1부터 100까지의 정수 중에서
		// 2의 배수가 아닌 숫자의 갯수를 구하세요.
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			count++;
		}
		System.out.println(count);

		// 문제3 161페이지 4번
		// 중첩 for문을 이용하여 방정식 4x + 5y =60의 모든 해 중
		// 첫번째로 구해지는 값을 (x,y)형태로 출력 (x,y는 10 이하의 자연수 입니다.
		Outter: for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println(x + ", " + y);
					break Outter;
				}
			}
		}

		// 문제4 do~while문과 Math.random() 함수를 이용
		// 1~10의 정수 중 7이라는 수가 나올때까지 숫자를 출력

		int index = (int) (Math.random() * 10) + 1;
		do {
			System.out.println(index + "번 실행");
		} while (index == 7);

		//문제5 161페이지 3번
		// while문과 Math.random() 함수를 이용
		// 2개의 주사위를 던졌을때 숫자를 (숫자1, 숫자2)로 출력
		// 숫자의 합이 5일 경우에 종료, 아닌 경우에 게속 던짐
		// 최종으로 주사위를 몇번 던졌는지 횟루를 출력
		// 숫자의 합이 5가되는 조합은 (1, 4),(4, 1),(2, 3),(3, 2)
		int total = 0;
		while(true) {
			int x = (int)(Math.random()* 6) + 1;
			int y = (int)(Math.random()* 6) + 1;
			total++;
			System.out.printf("( %d, %d )\n", x, y);
			if(x + y == 5) {
				break;
			}
		}
		System.out.println("주사위 던진 횟수는 총" + total + "번 입니다.");
		
		//문제7 161p
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				//메뉴 : 예금
				System.out.print("예금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance = balance + money;
			} else if(selectNo == 2) {
				//메뉴 : 출금
				System.out.print("출금액> ");
				int money = Integer.parseInt(scanner.nextLine());
			    balance -= money;
			} else if(selectNo == 3) {
				//메뉴 : 잔고
				System.out.println("잔고>" + balance);
			} else if(selectNo == 4) {
				//메뉴 : 종료
				run = false;
			} else {
				//기타입력
				System.out.println("정해진 메뉴 중에서 선택해주세요");
			} 
		}
		System.out.println("프로그램 종료");
	}
}
