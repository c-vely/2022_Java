package kr.ac.kopo.day06.exam;

import java.util.Scanner;

import kr.ac.kopo.day06.Employee;

public class ExamMain01_1 {
	
	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 몇 개의 아이스크림을 구매하시겠습니까? ");
		num = sc.nextInt();
		
		String str[] = new String[num];
		int price[] = new int[num];
				
		for(int i = 0; i < num; i++) {
			System.out.println("***" + (i+1) + "번째 아이스크림 구매 ***");
			System.out.println("아이스크림명 : ");
			str[i] = sc.next();
			System.out.println("아이스크림가격 : ");
			price[i] = sc.nextInt();		
		}
		
		Icecream[] ice = new Icecream[num];
		for(int i = 0; i < ice.length; i++) {
			ice[i] = new Icecream(i, str[i], price[i]);	
//			System.out.println("ice" + i + " = " + ice[i].cnt + ", " + ice[i].name + ", " + ice[i].price);
		}		
		
		
		System.out.println("< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호  " + "아이스크림명  " + "아이스크림가격");
		
		for(int i = 0; i < ice.length; i++) {
			System.out.println(ice[i].cnt+1 + "     " +  ice[i].name + "     " + ice[i].price);		
		}
		System.out.println("총 " +  Icecream.turnTotalNum + "개");
		System.out.println("총액 " +  Icecream.turnTotalPrice + "원");
		
		
		/*
		Icecream.TotalNumAndPrice();
		
		System.out.println("계속 구매하시겠습니까? ");
		String ch = sc.next();
		if(ch.charAt(0) == "n") {
			System.out.println("총 구매개수 : " + Icecream.totalNum + "개");
			System.out.println("총 구매액 : " + Icecream.totalPrice + "개");			
		}
		else {
			
			
			
		}
		*/
		 
		
		
		
		
		/*
		Icecream.turnTotalNum += num;
		for(int i = 0; i < price.length; i++) {
			Icecream.plusPrice(price[i]);	
		}
		*/
		
		/*
		System.out.println("< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호  " + "아이스크림명  " + "아이스크림가격");
		
		for(int i = 0; i < num; i++) {
			System.out.println((i+1) + "     " + str[i] + "     " + price[i]);		
		}
		System.out.println("총액 " +  Icecream.turnTotalPrice + "원");
		*/
		
				
		
		
	}

}
