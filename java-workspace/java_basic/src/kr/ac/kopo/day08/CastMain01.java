package kr.ac.kopo.day08;

public class CastMain01 {
	
	/*
	// 1) 오버로딩
	static void print(Child01 c) {		
		c.print();
	}	
	static void print(Child02 c) {		
		c.print();
	}	
	static void print(Parent p) {		
		p.print();
	}*/
	
	
	// 자동으로 묵시적 형변환 일어남 (전략 패턴의 기본적인 형태)
//	static void print(Parent p) {		
//		p.print();
//	}
	
	
	// 객체끼리 비교 방법 (참, 거짓으로 결과값 나옴)
	static void print(Parent p) {	
		
		/*
		System.out.println("p instanceof Child01 : " + ( p instanceof Child01));
		System.out.println("p instanceof Child02 : " + ( p instanceof Child02));
		System.out.println("p instanceof Parent : " + ( p instanceof Parent));
		*/
		
		// 어떤 객체인지 확인하여, 명시적 형변환하는 방법 (이러면 자식 객체의 메소드도 다 접근 가능)
		if( p instanceof Child01) {		
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
			c.print();
			
		} else if (p instanceof Child02) {
			Child02 c = (Child02)p;
			c.play();
			c.sing();
			c.print();
			
		} else if (p instanceof Parent) {
			p.print();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		/*
		// 이렇게 잘 안 씀
		Child01 c01 = new Child01();
		c01.sleep();
		c01.print();
		
		Parent p = new Parent();
		p.print();
		
		Parent p2 = new Child01(); // ---> 상속관계이기에, 묵시적 형변환 가능
		p2.print();	// ---> 오버라이드되어 있어 자식의 print()가 출력됨
		*/
		
		
		// 요렇게 많이 씀 (상속관계에서만 가능) ---> 매개변수로 객체를 넣고, 객체를 인자로 받는 print()메서드를 만듬
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
		
	}

}
