package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
		// 문제1 주어진 배열의 총 합과 평균을 구하세요
		int[] array = {10, 53, 26, 85, 75};
		
		int sum = 0;
		
		for(int i=0; i<array.length; i++) { //for(int i=0; i<array.length; i++)
			sum += array[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / array.length;
		System.out.printf("평균 : %2f\n", avg);
		
		//문제2 배열의 최대값과 최소값을 구하세요
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}	
		}
		System.out.println("max :" + max);
		System.out.println("min : " + min);
		
		//문제3 문제2에서 구한 최대값과 최소값이 각각 몇번째 뭔지 구하세요.
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(max == array[i]) {
				maxIndex = i;
			}
			if(min == array[i]) {
				minIndex = i;
			}	
		}
		System.out.println("최대값 : " + max + "는 " + (maxIndex + 1) + "번째입니다.");
		System.out.println("최소값 : " + min + "는 " + (minIndex + 1) + "번째입니다.");
	}

}
