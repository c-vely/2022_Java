package kr.ac.kopo.day08;


class 비비빅 {
	String company = "빙그레";
	int price = 1400;
	double 전체무게;
}

class 비비빅01 extends 비비빅 {
	double 팥중량;
	
	비비빅01(){
		팥중량 = 10;
		전체무게 = 100;
	}
}

class 비비빅02 extends 비비빅{
	double 팥중량;
	
	비비빅02(){
		팥중량 = 8;
		전체무게 = 90;
	}
}

class 비비빅공장 {
	
	// 1) 묵시적 형변환 (리턴값을 쓸때도 가능, 객체를 리턴값으로 넘기면 그 객체 안에 있는 멤버변수, 메소드를 다 쓸 수 있기 때문)
	비비빅 make비비빅() {
		return new 비비빅02();
	}
			
	
}

public class CastMain03 {
	
	public static void main(String[] args) {
		
		비비빅공장 factory = new 비비빅공장();
		
		// 1) 묵시적 형변환 
		비비빅 ice = factory.make비비빅();
		
		// 1) 명시적 형변환을 해야 쓸 수 있음, 무조건
		비비빅02 ice2 = (비비빅02)ice;
		System.out.println("팥중량 : " + ice2.팥중량);
		
		// 2) 위를 한줄로 줄이면.....
		비비빅01 ice3 = (비비빅01)factory.make비비빅();
		System.out.println("팥중량 : " + ice2.팥중량);
		
		
		
		
	}

}
