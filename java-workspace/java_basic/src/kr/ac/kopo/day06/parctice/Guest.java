package kr.ac.kopo.day06.parctice;

public class Guest {
	
	int totalMoney;
	boolean orderNow;
	int orderCnt;
	int payMoney;
	int change;
	
	
	
	int nowPay;
	
	Guest(){
		
	}
	
	Guest(int totalMoney, boolean orderNow) {
		this.totalMoney = totalMoney;
		this.orderNow = orderNow;
//		this.orderCnt = orderCnt;
	}
	
	
	
	void setCnt(int cnt) {
		this.orderCnt = cnt;		
	}
	
	void setPayMoney(int money) {
		this.payMoney = money;
	}
	
	int setTotalMoney() {
		this.change = this.totalMoney - this.payMoney;
		return this.change;
	}
	
	void order() {
			
	}
	
	void pay() {		
		System.out.println("man : " + payMoney + "원이라고요?");
		System.out.println("man : 여기 " + totalMoney + "원이요.");		
	}
	

}
