package kr.ac.kopo.day05;

public class ConstructorMain02 {

	public static void main(String[] args) {
	
		// 이름이 홍길동이고, 나이가 26살, 전화번호가 010-1111-2222 회원객체 생성
		Member m = new Member("홍길동", 26, "010-1111-2222");
		
		// 이름이 고길동이고, 나이가 30살인 회원객체 생성
		Member m2 = new Member("고길동", 30);
				
		m.info();
		m2.info();
		
	}
}
