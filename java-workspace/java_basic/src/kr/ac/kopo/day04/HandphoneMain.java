package kr.ac.kopo.day04;

// 클래스 위에 클래스를 넣으면 접근제한자를 넣지 않는다. (잘 쓰지 않는다)
class Handphone {
	
	String name;		// 소유자명
	String phone;		// 전화번호
	String company;		// 제조사
	
	
}


public class HandphoneMain {
	
	public static void main(String[] args) {
		
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phone = "010-1111-2222";
		hp.company = "삼성";		
		
		Handphone hp2 = new Handphone();
		hp2.name = "운길동";
		hp2.phone = "010-3333-4444";
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		hp3.name = "강길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "모토로라";
		
		
		// 1) for문
		Handphone[] hpArr = {hp, hp2, hp3};
		for(int i = 0; i < hpArr.length; i++) {
			System.out.print("소유자명 : " + hpArr[i].name);
			System.out.print(" 전화번호 : " + hpArr[i].phone);
			System.out.println(" 제조사 : " + hpArr[i].company);			
		}
		
		System.out.println("-------------------------------------");
		
		
		// 2) 1.5버젼 for문
		for(Handphone ph : hpArr) {
			System.out.print("소유자명 : " + ph.name);
			System.out.print(" 전화번호 : " + ph.phone);
			System.out.println(" 제조사 : " + ph.company);
		}
		
		System.out.println("-------------------------------------");
		
		
		
		
		
		
	}
}
