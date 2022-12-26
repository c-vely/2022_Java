package kr.ac.kopo.day04.exam;

/*
2. 1번 코드를 수정하는데, 
만일 입력받은 정수가 0~99가 아니라면 다시 입력받로고

num1 : 89
num2 : 34
num3 : 596
num3 : 10
num4 : 789
num4 : 27
num5 : 9

< PRINT >
89 34 10 27 9

< REVERSE >
90 72 1 43 98

 */

 import java.util.Scanner;

public class ExamMain02 {
	
	public static void main(String[] args) {

		int num[] = new int[5];
		int value = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요 \n 단, 정수는 0-99사이만 입력가능 : ");
		
		
		for(int i = 0; i < num.length; i++) {			 			 
			 do {				 				
				 value = sc.nextInt();					
				 num[i] = value;				 
				 System.out.println("num"+ (i+1) + " : " + num[i]);
				} while(value < 0 || value > 99 );				
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
