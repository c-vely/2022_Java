package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class IceCreamMarket {

	IceCream[] iceArr;
	Scanner sc = new Scanner(System.in);
	
	void open() {
	
		boolean timeOut = false;
		while(!timeOut) {
			
			System.out.print("아이스크림 몇개 구매할래? ");
			int cnt = Integer.parseInt(sc.nextLine());
			
			int sum = 0;
			iceArr = new IceCream[cnt];
			for(int i = 0; i < iceArr.length; i++) {
				System.out.println("*** " + (i+1) + "번째 구매정보 입력 ***");
				System.out.print("아이스크림명 : ");
				String name = sc.nextLine();
				System.out.print("아이스크림 가격 : ");
				int price = sc.nextInt();
				sc.nextLine();
				iceArr[i] = new IceCream(name, price);
				sum += price;
			}
			
			info();
			System.out.println("총계 : " + sum + "원");
			
			timeOut = isNext();
		}
		
		
	
	}
	
	boolean isNext() {
		boolean bool = false;
		System.out.print("계속할래?(Y/N) : ");
		String answer = sc.nextLine();
		answer = answer.toUpperCase();
		
		bool = answer.equals("Y");
		return !bool;
	}
	
	void info() {
		
		System.out.println("< " + iceArr.length + "개 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].getName() 
						+ "\t\t" + iceArr[i].getPrice());
		}
	}
	
	void close() {
		IceCream.icecreamCntInfo();
		IceCream.icecreamTotalInfo();
	}
}
