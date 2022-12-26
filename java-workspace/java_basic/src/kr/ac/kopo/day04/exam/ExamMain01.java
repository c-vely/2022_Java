package kr.ac.kopo.day04.exam;

/*
5개의 정수를 입력받아 다음과 같이 출력하는 코드 작성.
단, 정수는 0~99사이만 입력가능

num1 : 89
num2 : 34
num3 : 10
num4 : 27
num5 : 9

< PRINT >
89 34 10 27 9

< REVERSE >
90 72 1 43 98
 */

import java.util.Scanner;

public class ExamMain01 {
	
	public static void main(String[] args) {
		
		int num[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요 : ");
	
		for(int i = 0; i < num.length; i++) {			 
			num[i] = sc.nextInt();						 
			System.out.println("num"+ (i+1) + " : " + num[i]);		
		}		
		System.out.println();
		System.out.println();
		
		
		System.out.println("< PRINT >");		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("< REVERSE >");		
		for(int i = 0; i < num.length; i++) {		
			System.out.print(num[i] % 10);
			System.out.print(num[i] / 10);
			System.out.print(" ");			
		}
		System.out.println();		
		
	}

}
