package kr.ac.kopo.day06.exam;

import java.util.Scanner;

// 여러 개의 아이스크림을 관리함 (꼭 비지니즈 클래스를 만들어서 사용하는 것이 좋음)
public class IceCreamMarket {
	
	Scanner sc = new Scanner(System.in);
	
	IceCream_pro[] iceArr;
	
	int num = 0;
	int total  = 0;	
	String str = "";
	int value = 0;
	
	
	void open() {
		System.out.println("총 몇 개의 아이스크림을 구매하시겠습니까? ");
		num = sc.nextInt();
		iceArr = new IceCream_pro[num];
	}
	
	void sell() {
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("***" + (i+1) + "번째 아이스크림 구매 ***");
			System.out.println("아이스크림명 : ");
			str = sc.next();  //---> 한 단어만 가능 / 여러단어일때는 nextLine(); 이때 버퍼를 비우기 법을 활용해야 한다. 
			System.out.println("아이스크림가격 : ");
			value = sc.nextInt();		
			iceArr[i] = new IceCream_pro(str, value);	
		}	
	}
	
	void show()
	{
		System.out.println("< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호  " + "아이스크림명  " + "아이스크림가격");
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println((i+1)+ "     " +  iceArr[i].name + "     " + iceArr[i].price);		
		}
	}
	
	void total() {
		for(int i = 0; i < iceArr.length; i++) {
			total += iceArr[i].price;
		}		
		System.out.println("총 " +  total + "원");
		
	}
	
	
	
	
	

}
