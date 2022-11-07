package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		//부호 연산자 
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		byte b = 100;
		//byte result3 = (byte)-b;
		int result3 = -b; 
		System.out.println("result3 : " + result3);
		
		//증감연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++; //증감연산자가 단독일땐 1씩증가
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-------------------");
		z = x++;  //
		System.out.println("z = " + z); //12
		System.out.println("x = " + x); //13
		
		System.out.println("-------------------");
		z = ++x;
		System.out.println("z = " + z); //14
		System.out.println("x = " + x); //14
		
		System.out.println("-------------------");
		z = ++x + y++;
		System.out.println("z = " + z); //23
		System.out.println("x = " + x); //15
		System.out.println("y = " + y); //9
		/* 1) ++x => 15
		   3) y++ => 9  (계산할때는 뒤에 있는 연산자는 없다 생각하고 계산)
		   2) x + y => 15 + 8 => 23
		   4) = => z =(x + y) => z =23
		 */
		
		x = 5;
		y = 5;
		
		System.out.println("-------------------");
		z = x++ + --y;
		System.out.println("z = " + z); // 9
		System.out.println("x = " + x); // 6
		System.out.println("y = " + y); // 4
		/* 3) x++ => 6
		   1) --y => 4
		   2) x + y => 5 + 4 =9
		   4)z = x + y => z = 9
		 */
		
		System.out.println("-------------------");
		z = --x + y++;
		System.out.println("z = " + z); // 9
		System.out.println("x = " + x); // 5
		System.out.println("y = " + y); // 5
		/* 1) --x => 5
		   3) y++ => 5
		   2) x + y => 5 + 4 = 9
		   4)z = x + y => z = 9
		  */
		
		//논리 부정 연산자
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen ) {  
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업중입니다.");
			
			// 산수연산자 
			int v1 = 5;
			int v2 = 2;
			int result;
			
			result = v1 + v2;
			System.out.println("result : " + result);
			
			result = v1 - v2;
			System.out.println("result : " + result);
			
			result = v1 * v2;
			System.out.println("result : " + result);
			
			result = v1 / v2;
			System.out.println("result : " + result);
			
			result = v1 % v2;
			System.out.println("result : " + result);
			
			// 비교연산자
			int num1 = 10;
			int num2 = 10;
			boolean bResult;
			
			bResult = ( num1 >= num2 );
			System.out.println(">= : " + bResult);
			
			bResult = ( num1 == num2 );
			System.out.println(">= : " + bResult);
			
			bResult = ( num1 != num2 );  //같지않을때		
			System.out.println("!= : " + bResult);
			
			char char1 = 'A'; // 65   //보이는것만 문자고 실제는 숫자 
			char char2 = 'B'; // 66
			System.out.println("문자비교 : " + (char1 > char2));
			
			int v3 = 1;
			double v4 = 1.0;
			System.out.println("int VS double : " + (v3 == v4));
			
			float v5 = 0.1F;
			double v6 = 0.1;
			System.out.println("float VS double : " + (v5 == v6));
			System.out.println("float VS float : " + (v5 == (float)v6));

			// 논리연산자
			int charCode = 'A';
			
			// 유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자 
				if((charCode >= 65) && (charCode <= 90)) {
				System.out.println("대문자");
				}
			// 유니콛 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
				if((charCode >= 97) & (charCode <= 122)); { //&& 같다는 의미
				System.out.println("소문자");
				}
			// 유니코드 중 48보다 크고 57보다 작으면 숫자0~9
				if ((charCode > 48) &&(charCode < 57)); {
					System.out.println("숫자 0~9");
				}
				
				int numValue = 6;
				if((numValue % 2 == 0) | (numValue % 3 == 0)) {
					System.out.println("2 또는 3의 배수군요");
				}
				
				if((numValue % 2 == 0) || (numValue % 3 == 0)) {
					System.out.println("2 또는 3의 배수군요");
				}
				
				// 복합 대입 연산자
				int resultA = 0;
				
				resultA += 10; // resultA = resultA + 10 /10
				System.out.println("+= : " + resultA);
				
				resultA -= 5; // resultA = resultA - 5 /5
				System.out.println("-= : " + resultA);
				
				resultA *= 3; // resultA = resultA * 3 /15
				System.out.println("*= : " + resultA);
				
				resultA /= 5; // resultA = resultA / 5 /3
				System.out.println("/= : " + resultA);
				
				resultA %= 3; // resultA = resultA % 3 /0
				System.out.println("%= : " + resultA);
				
				// 삼항연산자
				int score = 85;
				char grade = (score > 90) ? 'A' : 'B';
				System.out.printf("성적은 %d이고 등급은 %c입니다.\n", score, grade);
				//%c는 char 타입에 사용
				
				int age = 17;
				String message = (age >= 20) ? "성인" : "미성년자";
				System.out.printf("나이는 %d살이며 %s입니다.\n", age, message);
			}
			
		}
	}