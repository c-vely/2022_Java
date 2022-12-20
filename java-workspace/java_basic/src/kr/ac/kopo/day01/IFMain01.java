package kr.ac.kopo.day01;

public class IFMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("기상한다");
		
		/* 무조건 실행
		if(true) {
			System.out.println("밥먹고, ");
		}
		*/
		
		/* 절대 실행하지 않음 (Dead Code)
		if(false) {
			System.out.println("밥먹고, ");
		}
		*/
		
		int time = 640;
		
		if(time < 700) {
			System.out.println("밥먹고, ");
		}
		
		System.out.println("학교간다");
	}

}
