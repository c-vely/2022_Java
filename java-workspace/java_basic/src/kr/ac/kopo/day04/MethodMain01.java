package kr.ac.kopo.day04;

/*
**********
Hello
**********
Hi
**********
*Good-bye
***********
 */


public class MethodMain01 {
	
	// 3) 메소드 만들기 : 문장을 배열로 가지고 있는 집합 만들기  --> 수정 용이함
	static void prnStar() {					// <-- 잠시 static 사용. 빨간줄 안 뜨게 하려고. 이유는 나중에 설명
		System.out.println("**********");		
	}
	
	
	// 4) 매개변수(Parameter or Argument) 있는 메소드 만들기
	static int prnStar1(int data) {						
		int a = 10;
		System.out.println("**********");
		System.out.println("data : " + data);		
		
		return a;
	}
	
	
	
	public static void main(String[] args) {
		
		// 1) 출력
		System.out.println("**********");
		System.out.println("Hello");
		System.out.println("**********");
		System.out.println("Hi");
		System.out.println("**********");
		System.out.println("Good-bye");
		System.out.println("**********");
				
		System.out.println();
		
		
		// 2) 출력 - 반복줄이기?? (x)  --> 반복문은 반복되는 문장이 연달아나와야지만 사용해야 한다.  
		for(int i=0; i<4; i++) {
			System.out.println("**********");
			System.out.println();
		}
		
		System.out.println();
		
		
		
		// 3) 메소드 실행 (Main메소드가 호출자 메소드)
		prnStar();						// 피호출자 메소드
		System.out.println("Hello");
		prnStar();
		System.out.println("Hi");
		prnStar();
		System.out.println("Good-bye");
		prnStar();
				
		System.out.println();
		
		
		
		// 4) 메소드 실행 + 각각의 메소드의 변수에 접근해 보기
		int num = 10;
		int b = prnStar1(num);
		System.out.println("b : " + b);
		prnStar();
		
		System.out.println();
		
		
		
		
		

		
		
	}

}
