package com.yedam.java.ch0401;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// 문제1 두 개의 정수가 주어졌을 때
		//  두 정수의 합이 자연수이면 'Natural Number'를 출력하는 코드를 작성하세요.
		
		int a = 6;
		int b = -3;
		
		if(a + b > 0)
			System.out.println("Natural Number");

		// 문제2 두 개의 정수가 주어졌을 때
		// 두 수의 대소관계에 따라서 부등호를 출력하는 코드를 출력하세요.
		
		if(a > b) {
			System.out.println(">");
		} else if (a == b) {
			System.out.println("=");
		} else {
			System.out.println("<");
		}
		
		//문제3 체질량 지수인 BMI에 따라 비만도를 네가지로 단계로 구분
		// BMI = 체중(kg) / (키(m) * 키(m)
		// 저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상)
		
		double weight = 40;
		double height =1.6f;
		 
		double bmi = weight / (height * height);
		 // if(bmi >= 30) {  System.out.println("비만"); }
		 
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 25  ) {
			System.out.println("정상");
 		} else if (bmi < 30 ) {
		    System.out.println("과체중");
 		} else { 
 			 System.out.println("비만");
 	    }
		
		//문제4 선택한 단의 6번째 값을 출력하는 코드
		// 예를 들어, 2단일 경우 2x6=12
		//단, 출력문에는 변수 사용하지 않는다.
		int dan = (int)(Math.random() * 9) + 1;
		
		switch(dan) {
		case 1:
			 System.out.printf("%d X 6 = %d\n", 1, 1*6);
			 break;
		case 2:
			System.out.printf("%d X 6 = %d\n", 2, 2*6);
			 break;
		case 3:
			System.out.printf("%d X 6 = %d\n", 3, 3*6);
			 break;
		case 4:
			System.out.printf("%d X 6 = %d\n", 4, 4*6);
		     break;
		case 5:
			System.out.printf("%d X 6 = %d\n", 5, 5*6);
		     break;
	    case 6:
		    System.out.printf("%d X 6 = %d\n", 6, 6*6);
		     break;
	    case 7:
		    System.out.printf("%d X 6 = %d\n", 7, 7*6);
		     break;
		case 8:
			System.out.printf("%d X 6 = %d\n", 8, 8*6);
			 break;
	    default:
		    System.out.printf("%d X 6 = %d\n", 9, 9*6);
		     break;
		}
		
		// 문제5 다음과 같이 점수 범위에 따라 등급을 구분
		//해당 점수에 대한 등급을 출력하는 코드
		//90점 이상 100점 이하 : A등급,
		//80점 이상 90점 이하 : B등급,
		//70점 이상 80점 이하 : C등급,
		//60점 이상 70점 이하 : D등급,
		//60점 미만: E등급
		
		double score = 75;
		
		switch((int)(score / 10)) {
		case 10:
		case 9:
			 System.out.println("A");
			 break;
		case 8:
			 System.out.println("B");
			 break;
		case 7:
			 System.out.println("C");
			 break;
		case 6:
			 System.out.println("D");
			 break;
		default:
			 System.out.println("E");
		}
 		
	}

}
