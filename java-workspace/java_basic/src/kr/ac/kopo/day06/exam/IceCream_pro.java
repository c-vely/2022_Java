package kr.ac.kopo.day06.exam;

// 단일 아이스크림만 
public class IceCream_pro {
	
	String name; 				//아이스크림명
	int price;					//가격
	
	// 여기 부분은 market에 있는게 좋으나, static 연습할 거면 여기에 둬도 괜춘 (건당 판매된 금액은 market에서 계산하면됨)
	static int icecreamCnt;		//총 판매된 아이스크림 개수
	static int icecreamTotal;	//총 판매된 아이스크림 가격
	
	
	IceCream_pro(String name, int price){
		this.name = name;
		this.price = price;
		
		IceCream_pro.icecreamCnt++;
		IceCream_pro.icecreamTotal += price;
	}
	
	
	String getName() {
		return this.name;
	}
	
	int getPrice() {
		return price;
	}
	
	
	static void icecreamCntInfo() {
		System.out.println("판대된 총 개수 : " + IceCream_pro.icecreamCnt + "개");
	}
	
	static void icecreamTotalInfo() {
		System.out.println("판대된 아이스크림 총계 : " + IceCream_pro.icecreamTotal + "원");
	}
	
	

}
