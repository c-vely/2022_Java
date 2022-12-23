package kr.ac.kopo.day04;

// 따로 쓸때는 public 접근제한자를 붙여야 한다. (이걸 보통 더 많이 쓴다)
public class CarMain {
	
	public static void main(String[] args) {
		
		// 인스턴스 객체 생성
		Car c = new Car();
		Car c2 = new Car();
		
		// 주소가 다름
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println("--------------------------------------");
		
		// c 멤버변수 초기화 (. 직접 참조 연산자) 
		c.name = "소나타";
		c.price = 3000;
		
		// c2 멤버변수 초기화
		c2.name = "모닝";
		c2.price = 1800;
		
		// 출력
		System.out.println("모델명 : " + c.name + ", 가격 : " + c.price);
		System.out.println("모델명 : " + c2.name + ", 가격 : " + c2.price);
		
		
	}

}
