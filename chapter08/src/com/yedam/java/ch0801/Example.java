package com.yedam.java.ch0801;

public class Example {

	public static void main(String[] args) {
		ImplememtationC impl = new ImplememtationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
		

	}

}
