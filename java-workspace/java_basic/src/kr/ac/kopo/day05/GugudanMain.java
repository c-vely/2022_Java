package kr.ac.kopo.day05;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9사이의 단을 입력 : ");
		int dan = sc.nextInt();
		
		Gugudan gu = new Gugudan();
		gu.print(dan);
		
		gu.print();
		
		System.out.print("시작단 : ");
		int sdan = sc.nextInt();
		
		System.out.print("종료단 : ");;
		int edan = sc.nextInt();
		
		gu.print(sdan, edan);
		
	}
}







