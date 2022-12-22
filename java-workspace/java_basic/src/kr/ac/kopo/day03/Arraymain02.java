package kr.ac.kopo.day03;

import java.util.Scanner;

public class Arraymain02 {
	
	public static void main(String[] args) {
		
		/*
		 	키보드로 5개의 정수를 입력받아 출력하는 코드 작성
		 	num1 : 45
		 	num2 : 34
		 	num3 : 892
		 	num4 : 9
		 	num5 : 100
		 	
		 	< 5개의 정수 출력 > --> 값을 모두 저장할 필요가 있을 때만 배열 사용
		 	45 34 892 9 100
		 			 	
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println("< 5개의 정수 출력 >");
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
		
	}

}
