package kr.ac.kopo.day06.exam;

import java.util.Scanner;

// 여러 개의 아이스크림을 관리함 (꼭 비지니즈 클래스를 만들어서 사용하는 것이 좋음)
public class IceCreamMarket_pro {
	
	IceCream_pro[] iceArr;
	Scanner sc = new Scanner(System.in);
	
	
	
	void open() {
		
		boolean timeOut = false;
		while(!timeOut) {
			
			System.out.println("총 몇 개의 아이스크림을 구매하시겠습니까? ");
			
			// 1) 버퍼 없애려면 아래처럼
//		int cnt = sc.nextInt();
//		sc.nextLine();
			
			// 2) Integer.parseInt
			int cnt = Integer.parseInt(sc.nextLine());
			
			int sum = 0;
			iceArr= new IceCream_pro[cnt];
			for(int i = 0; i < iceArr.length; i++) {
				System.out.println("***" + (i+1) + "번째 아이스크림 구매 ***");
				System.out.println("아이스크림명 : ");
				String name = sc.nextLine();
				System.out.print("아이스크림가격 : ");
				int price = sc.nextInt();		
				sc.nextLine();
				iceArr[i] = new IceCream_pro(name, price);
				sum += price;
			}
			
			info();
			System.out.println("총계 : " + sum + "원");
			
			timeOut = isNext();
		}							
	}
	
		
	
	boolean isNext() {
		boolean bool  = false;
		System.out.print("계속할래?(Y/N) : ");
		String answer = sc.nextLine();
		answer = answer.toUpperCase();
		
		bool = answer.equals("Y");
		
		return !bool;		
	}
	
	
	
	void info() {
		System.out.println("< " + iceArr.length + "개 구매정보 출력 >");
		System.out.println("번호\t아이스크림\t아이스크림가격");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println((i+1) + "\t" + iceArr[i].getName() + "\t\t" + iceArr[i].getPrice());
		}			
	}
	
	
	
	void close() {
		IceCream_pro.icecreamCntInfo();
		IceCream_pro.icecreamTotalInfo();
		
		
		
		
	}
	

	
	
	
	
	

}
