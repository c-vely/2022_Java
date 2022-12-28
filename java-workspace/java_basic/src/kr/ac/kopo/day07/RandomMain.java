package kr.ac.kopo.day07;

import java.util.Random;

public class RandomMain {
	
	public static void main(String[] args) {
		
		//임의의 정수값을 추출
		Random r = new Random();
		
		int random = r.nextInt(); 	// <-- 랜덤 값
		int random1 = r.nextInt(10); 	// <-- 0~9까지
		int random2 = r.nextInt(4) + 1; 	// <-- 0~3까지 , 1~4까지 나옴.
		
		System.out.println(random);
	}

}
