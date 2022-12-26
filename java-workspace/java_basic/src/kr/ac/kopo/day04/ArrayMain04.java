package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {
	
	public static void main(String[] args) {

//		String name01 = "홍길동";
		
		String[] strArr = {"홍길동", "강길동", "윤길동"};
		
		System.out.println("첫번째 이름 : " + strArr[0]);
		System.out.println("두번째 이름 : " + strArr[1]);
		System.out.println("세번째 이름 : " + strArr[2]);		
		
		/*
		  배열의 전체 원소를 출력하는 방법 3가지
		  1. index를 이용
		  2. 1.5버전의 for문을 이용 (for : ) --> 범위 지정 안됨. 무조건 모든 원소에 접근. 그러나 break를 사용에 멈출 수는 있음
		  3. Arrays.toString() 메소드 이용  --> 배열 원소가 하나의 문자열이 됨
		 */
		
		// 1)
		System.out.println(" < index를 이용한 원소 출력 >");
		for(int i =0; i < strArr.length; i++)
		{
			System.out.println(strArr[i]);
		}
		
		
		// 2)		
		System.out.println(" < 1.5버전의 for문을 이용한 원소 출력 >");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		// 3)
		System.out.println(" < Arrays.toString() 이용한 원소 출력 >");
		System.out.println(Arrays.toString(strArr));
		
		
		
	
		
	}

}
