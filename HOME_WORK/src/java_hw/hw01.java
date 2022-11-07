package java_hw;

public class hw01 {
		public static void main(String[] args) {
			/* 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
			   출력예시) "변수명1: 변수값, 변수명2: 변수값" */
			int n = 37;
			int n2 = 91;
			System.out.println("변수명1 : " + n);
			System.out.println("변수명2 : " + n2);
			
			/* 문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.*/
			System.out.println(n2 + n);
			System.out.println(n2 - n);
			System.out.println(n2 * n);
			System.out.println(n2 / n);
			
			/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
		    출력예시) int a = 10; 의 경우 "10, int"로 출력. */
	        long var1 = 128;
			char var2 = 'B';
			int var3 = 44032;
			long var4 = 100000000000L;
			double var5 = 43.93106;
			float var6 = 301.3F;
			System.out.printf("%d\n", var1);
			System.out.printf("%s\n", var2);
			System.out.printf("%d\n", var3);
			System.out.printf("%d\n", var4);
			System.out.printf("%s\n", var5);
			System.out.printf("%s\n", var6);

			// 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
			byte a = 35;
			byte b = 25;
			int c = 463;
			long d = 1000L;
			double e = 45.31;
			
			long result1 = a + c + d;
			System.out.println(result1);
			
			int result2 = a + b + c;
			System.out.println(result2);

			double val3 = c + d + e;
			System.out.println(val3);	
			
			/* 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
		    출력예시) A278번지10.0 */
		    int intValue1 = 24;
		    int intValue2 = 3;
		    int intValue3 = 8;
		    int intValue4 = 10;
		    char charValue = 'A';
		    String strValue = "번지";
		    
		    String charvalue = String.valueOf(charValue);
		    System.out.println(charvalue + (intValue1 + intValue2) + (int)intValue3 + strValue + (float)intValue4 );
		}
                //git 관련 작업추가
	}


