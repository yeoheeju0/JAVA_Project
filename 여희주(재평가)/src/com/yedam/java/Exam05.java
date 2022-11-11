package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] scores = null;
		int studentNum = 0;

		while (run) {
			System.out.println("===1.학생 수 입력 2.학생점수 등록 3.학생점수 전체조회 4.학생점수 분석 5.종료===");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			switch (selectNo) {
			case 1:
				System.out.println("학생 수 > ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;

			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					int scorse = Integer.parseInt(sc.nextLine());
					scores[i] = scorse;
				}
				break;

			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				int max = scores[0];
				int min = scores[0];
				
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					if (min > scores[i]) {
						min = scores[i];
					}
					
					sum += scores[i];
				}System.out.println("학생 수 > ");
				System.out.println("최고점수 : " + max);
				System.out.println("최저점수 : " + min);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default : 
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}

		}

	}

}
