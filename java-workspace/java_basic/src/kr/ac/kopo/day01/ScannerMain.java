package kr.ac.kopo.day01;

import java.util.Scanner; //패키지명 미리 선언하면 짧게 쓸 수 있음. 

public class ScannerMain {
	
	public static void main(String[] args) {
		
		// import 안 하면 패키지명 포함해서 써야 함.
//		java.util.Scanner sc = new java.util.Scanner(System.in);
				
		Scanner sc = new Scanner(System.in);
		
		/*
		// 문자열 입력
		System.out.print("문자열을 입력 : ");
//		String str = sc.next();  		// 문자열을 입력 (단어 단위)
		String str = sc.nextLine(); 	//문자열을 입력 (문장 단위)
		System.out.println("str : [" + str + "]");
		*/
		
		/*
		// 정수 입력
		System.out.print("정수를 입력 : ");	
		int num = sc.nextInt();
		System.out.println("num : "+ num);
		System.out.printf("%d + 10 = %d\n", num, num+10);
		*/
		
		/*
		// 실수 입력
		System.out.print("실수를 입력 : ");	
		double num1 = sc.nextDouble();
		System.out.println("num1 : "+ num1);
		System.out.printf("num1 : %f\n", num1);
		*/
		
		/*
		// 키보드 입력시 버그 아닌 버그 ㅋㅋㅋ (다른 프로그램에서도 발생함. 입력버퍼 때문임)
		String str2 = sc.nextLine();
		System.out.println("str2 : [" + str2 + "]");
		*/
		
		
		// 문자 입력
		System.out.print("문자를 입력 : ");	
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch = " + ch);
			
		
	}

}
