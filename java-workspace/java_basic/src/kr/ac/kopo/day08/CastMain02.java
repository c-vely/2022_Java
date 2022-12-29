package kr.ac.kopo.day08;

public class CastMain02 {
	
	public static void main(String[] args) {
		
		// 컴파일 시점 에러
//		Parent p = new Parent();
//		Child01 c = p;
		
		// 강제 형변환으로 컴파일 에러는 안 나지먼 런타임 시점에서 에러 발생
//		Parent p = new Parent();
//		Child01 c = (Child01) p;
		
		// 꼭 묵시적 형변환이 되도록 해야 에러 발생 안됨 (보통 팩토리 패턴을 만들 때 많이 사용)
		Parent p = new Child01();
		Child01 c = (Child01) p;
		
		c.study();
		c.sleep();
		c.print();
		
		
	}

}
