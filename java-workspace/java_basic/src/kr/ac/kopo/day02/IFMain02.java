package kr.ac.kopo.day02;

import java.util.Scanner;

public class IFMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("집에서 출발한 시간을 입력 (예)7시15분은 715입력 : ");
		int time = sc.nextInt();
		
		System.out.println("기상한다");
		
		if(time < 800) {
			System.out.println("걸어서");
		} else {
			System.out.println("버스타고");
		}
		
		System.out.println(time < 800 ? "걸어서" : "버스타고");		
		
	}

}
