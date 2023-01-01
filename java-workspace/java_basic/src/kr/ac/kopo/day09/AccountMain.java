package kc.ac.kopo.day09;

public class AccountMain {
	
	public static void main(String[] args) {
		
		/*
		// 1) 계좌 생성 여러개 가능
		Account ac = new Account();
		System.out.println(ac);
		
		Account ac2 = new Account();
		System.out.println(ac2);
		*/
		
		
		
		// 2) 인스턴스 1개만 만드는 방법은? 생성자를 private로 만듬. 그렇다면 생성방법은?	
		Account ac = Account.getInstance();
		System.out.println(ac);
		
		Account ac1 = Account.getInstance();
		System.out.println(ac1);
		
		Account ac2 = Account.getInstance();
		System.out.println(ac2);
		
		
		
		// 디버깅 Run > Debug > F5, F6, F7 기억하기
		int cnt = 0;
		while(cnt <= 5) {
			System.out.println(cnt);
			cnt++;
		}
		System.out.println(cnt);
		
		
	
		
		
		
		
		
	}



	

}
