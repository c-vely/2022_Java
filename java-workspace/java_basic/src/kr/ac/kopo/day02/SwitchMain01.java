package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 키보드로 1 ~ 3사이의 정수를 입력
 1 입력 시 "ONE" 출력
 2 입력 시 "TWO" 출력
 3 입력 시 "THREE" 출력
 그 위 경우 "Error" 출력
*/
public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - 3사이의 정수 입력 : ");
		int num = sc.nextInt();
		//System.out.println("num : " +  num);
		
		
		// switch문 (다중 선택문)
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default:
			System.out.println("ERROR");
		}
				
		
	}

}
