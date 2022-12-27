package kr.ac.kopo.day06.exam;

public class IceCream {

	String name;	/** 아이스크림명 */
	int price;		/** 가격 */
	static int	icecreamCnt;	/** 판매된 아이스크림 총 개수 */
	static int icecreamTotal;	/** 판매된 아이스크림 총 구매액 */
	
	IceCream() {}
	
	IceCream(String name, int price) {
		this.name = name;
		this.price = price;
		
		IceCream.icecreamCnt++;
		IceCream.icecreamTotal += price;
	}
	
	String getName() {
		return this.name;
	}
	
	int getPrice() {
		return price;
	}
	
	
	static void icecreamCntInfo() {
		System.out.println("판매된 총 개수 : " + IceCream.icecreamCnt + "개");
	}
	
	static void icecreamTotalInfo() {
		System.out.println("판매된 아이스크림 총계 : " + IceCream.icecreamTotal + "원");
	}
}
