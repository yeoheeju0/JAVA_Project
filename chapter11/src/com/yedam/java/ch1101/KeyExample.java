package com.yedam.java.ch1101;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//HashMap -> Key, value 데이터를 저장
		//
	
		HashMap <Key, String> hashmap = new HashMap<>();
		
		//new key(1) -> 1
		hashmap.put(new Key(1), "홍길동");
		             //열쇠        데이터
		
		//new Key(1) -> 2
		String value = hashmap.get(new Key(1));
		System.out.println(value);

		Key key = new Key(1);
		
		System.out.println(key.toString());
	}

}
