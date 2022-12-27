package kr.ac.kopo.day06.exam;

public class Icecream {
	
	int cnt = 0;
	String name = "";
	int price = 0;
	
	static int totalNum = 0;
	static int turnTotalNum = 0;
	
	static int totalPrice = 0;
	static int turnTotalPrice = 0;
	
	
	Icecream(){
		Icecream.turnTotalNum++;
	}
	
	Icecream(int cnt, String name, int price){
		this();
		this.cnt = cnt;
		this.name = name;
		this.price = price;		
		Icecream.plusPrice(price);
	}
	
	
	
	
	static void plusPrice(int price) {
		Icecream.turnTotalPrice += price;  
	}
	
	static void TotalNumAndPrice() {
		Icecream.totalPrice += Icecream.turnTotalPrice;  
		Icecream.totalNum += Icecream.turnTotalNum;  		
	}
	
	/*
	static void info( ) {
		System.out.println("< 총 " + Icecream.turnTotalNum + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호  " + "아이스크림명  " + "아이스크림가격");
		
		for(int i = 0; i < Icecream.turnTotalNum; i++) {
			System.out.println((i+1) + "     " + str[i] + "     " + price[i]);		
		}
		System.out.println("총액 " +  Icecream.turnTotalPrice + "원");		
		System.out.println();
	
		System.out.println("번호 : "+ cnt + ", 아이스크림명 : " +  name + ", 아이스크림가격  : " + price);		
	}
	*/
	
	

}
