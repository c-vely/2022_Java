package kr.ac.kopo.day01;

public class OperationMain01 {
	public static void main(String[] args) {
		
		int num = 10;	
		
//		num = num + 1;	// 대입연산자 (우선순위가 가장 낮음)
//		num += 1;		// 복합 대입 연산자 (배경 연산자)
//		++num; 			// 전위 증가 연산자 (변수 값이 수정됨, 정수형만 사용가능)
//		num++;			// 후위 증가 연산자
				
//		System.out.println("num : " + num);
		
		
		
		System.out.println("num : " + ++num); //먼저 증가한 다음 출력해 (전위증가연산자)
		
		num = 10;
		System.out.println("num : " + num++); //먼저 변수 출력하고 증가시켜 (후위증가연산자)
		
		
		
		// 좋지 않은 예
		num = 1;
		System.out.println(++num + ++num);
		System.out.println(num);
		
		
		
		// 
		
		

		
		
	}

}
