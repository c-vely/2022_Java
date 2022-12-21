package kr.ac.kopo.day02;

public class LoopMain02 {

	public static void main(String[] args) {
		
		/*
		//무한 반복
		while(true) {
			
		}
		
		//무한 반복
		for(;;) {
			System.out.println("hello");
		}
		*/
		
		//cnt는 for문 안에서만 사용 가능
		for(int cnt = 1; cnt <= 5 ; ++cnt) {
			System.out.println("Hello");
		}
		
		// cnt1를 여기저기 다 쓰고 싶다면
		int cnt1;
		for(cnt1 = 1; cnt1 <= 5 ; ++cnt1) {
			System.out.println("Hello");
		}
		
		
		
		
		
		
	}
}
