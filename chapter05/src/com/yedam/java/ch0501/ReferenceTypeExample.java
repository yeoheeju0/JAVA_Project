package com.yedam.java.ch0501;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		//null과 NullpositionExveption
//		String str = null;
//		System.out.println("길이 : " + str.length());

		//String(문자열)비교
		String strVal1 = "신미철";
		String strVal2 = "신미철";
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2가 문자열이 같음");
		}
		
		System.out.println("=================================");
		String strVal3 = new String("신미철");
		String strVal4 = new String("신미철");
		if(strVal3 == strVal4) {
			System.out.println("strval3와 strVal4는 참조가 같음");
		} else {
			System.out.println("strval3와 strVal4는 참조가 다름");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strval3와 strVal4는 문자열이 같음");
		}
	}
}
