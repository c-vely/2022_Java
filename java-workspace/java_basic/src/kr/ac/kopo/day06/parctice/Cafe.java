package kr.ac.kopo.day06.parctice;

import java.util.Scanner;

public class Cafe {
	
	Coffee[] coffArr;
	
	
	int cnt;
	int total;

	
	
	Scanner sc = new Scanner(System.in);
	
	void open(Guest man) {
				
		boolean order = false;				
		while(order) {		
			System.out.println("주문하시겠습니까? ");
			if(man.orderNow == true) {
				System.out.println("man : yes!!");
				order = !order;		
			}
		}
		
		while(!order) {
			System.out.println("몇 잔 드시겠습니까? ");
			cnt = Integer.parseInt(sc.nextLine());
			
			coffArr = new Coffee[cnt];
			man.setCnt(cnt);
			
			for(int i = 0; i < coffArr.length; i++) {
				System.out.println("*** " + (i+1) + "번째 구매정보 입력 ***");
				System.out.print("음료이름 : ");
				String name = sc.nextLine();
				System.out.print("음료가격 : ");
				int price = sc.nextInt();
				sc.nextLine();
				coffArr[i] = new Coffee(name, price);
				total += price;
			}
			
			sell();
			System.out.println("총계 : " + total + "원");
			man.setPayMoney(total);
			
			order = isNext();		
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
	
	
	void sell() {
		System.out.println("< " + coffArr.length + "개 구매정보 출력 >");
		System.out.println("번호\t음료이름\t음료가격");
		for(int i = 0; i < coffArr.length; i++) {
			System.out.println(i+1 + "\t" + coffArr[i].getName() 
						+ "\t\t" + coffArr[i].getPrice());
		}		
	}
	
	
	void bye(int change) {		
//		int change = man.setTotalMoney();		
		System.out.println("네, 잔돈 " + change + "원입니다.\n감사합니다. 또 오세요.");				
	}
	
	

}
