package kr.ac.kopo.day02.exam;

import java.util.Scanner;
/*
 * 나이를 입력 : 27
 * 27세는 20대입니다.
 * 
 * 나이를 입력 : 58
 * 58세는 50대입니다.
 * -----------------------------
 * 0 ~ 9세    영유아입니다.
 * 10 ~ 19세  10대
 * 20 ~ 29세  20대
 * ...
 * 50 ~ 59세  50대
 * ...
 * 90 ~ 99세  90대
 * 
 * 이외는       Error
 * 
 * 나이를 입력 : -4
 * 나이를 잘못입력했습니다.
 */

public class ExamMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이을 입력 : ");
		
		int num = sc.nextInt();
		
//		int result = (num >= 0 && num < 99 ?  1 : 0);
		String result = (num >= 0 && num < 99 ? "OK" : "ERROR");
		
		
		//switch문 이용
		switch(result) {
		case "OK" :
			switch(num / 10) {
			case 0 :
				System.out.println(num + "세는 영유아입니다.");
				break;
			default :
				System.out.println(num + "세는 " + (num /10) + "0대입니다.");
			}
		}
		
		
		
		//교수님
		if(num >= 0 && num <= 99) {
			switch(num / 10)
			{
			case 0 :
				System.out.println(num + "세는 영유아입니다.");
				break;
			default :
				System.out.println(num + "는 " + num/10 + "세 입니다.");
			}
			System.out.println("잘못 입력하였습니다.");
		} else if(num < 10) {
			System.out.println(num + "는 영유아 입니다.");	
		} else if(num < 20) {
			System.out.println(num + "는 10대 입니다.");	
		} else if(num < 30) {
			System.out.println(num + "는 20대 입니다.");	
		} else if(num < 40) {
			System.out.println(num + "는 30대 입니다.");	
		} else if(num < 50) {
			System.out.println(num + "는 40대 입니다.");	
		} else if(num < 60) {
			System.out.println(num + "는 50대 입니다.");	
		} else if(num < 70) {
			System.out.println(num + "는 60대 입니다.");	
		} else if(num < 80) {
			System.out.println(num + "는 70대 입니다.");	
		} else if(num < 90) {
			System.out.println(num + "는 80대 입니다.");	
		} else if(num < 100) {
			System.out.println(num + "는 90대 입니다.");	
		} 
		
		
		
		
		
		
		
	}
	
}
