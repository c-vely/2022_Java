package kc.ac.kopo.day09;

import java.util.Random;

// 1) 상속 가능
//2) final 붙으면 상속 불가능
/*final*/ class Super {	
	
	// 1) 오버라이드 가능
	void info() {
		System.out.println("나는 SUPER");
	}		
	 
	/*
	// 2) 오바라이드 불가능
	final void info() {
		System.out.println("나는 SUPER");
	}	 
	*/
}


class Sub extends Super {
	
	@Override
	void info() {
		System.out.println("나는 SUB");
	}
}


// 4) 매번 +1하기 귀찮아서 Random을 상속받아 nextInt()를 재정의 하자.
class MyRandom extends Random {
	
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}
}

/*
// String 클래스는 final로 정의되어 있으서 재정의 못함.
class MySting extends String {
	
}
*/



public class FinalMain {
	
	
	public static void main(String[] args) {
		
		// 1) 값을 변경할 수 있음
		Super s = new Super(); 
		System.out.println(s);
		
		s = new Super();
		System.out.println(s);
		
		
		// 2) 값을 변경할 수 없음
		final Super s1 = new Super(); 
		System.out.println(s1);
		
		s1 = new Super();
		System.out.println(s1);
		
		
		
		// 3) 일반적으로 
		Random r = new Random();
		int random = r.nextInt(10) +1;
		System.out.println("random : "+ random);
		
		final Super s2 = new Super();
		System.out.println(s2);
		
		
		// 4) 내가 재 정의한 클래스 사용
		Random r1 = new MyRandom();  // Random객체의 메소드를 다 사용할 수 있음.
		int random1 = r.nextInt(2);  // nextInt메소드만 오버라이딩해서 쓸 수 있음
		System.out.println("random : "+ random1);
		
		final Super s3 = new Super();
		System.out.println(s3);
		
		
		
		
		
		
	}

}
