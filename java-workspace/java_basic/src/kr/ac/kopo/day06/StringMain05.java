package kr.ac.kopo.day06;

public class StringMain05 {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		/*
		// int ==> 0.002초
		int sum = 0;
		for(int i = 0; i < 1000000; i++) {
			sum = sum + i;
		}
		*/
		
		
		/*
		// 문자열 + 정수 ==> 6.403초 (문자열은 변화할 수 없기에 이런 현상 생김. 그래서 변화를 많이 할 때는 문자열 쓰면 안됨)
		String str = "";
		for(int i = 0; i < 100000; i++) {
			str = str + i; // == str.concat(i);
		}	
		*/
		
		
		// 대신 StringBuffer or 
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
		
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : "+ (end - start) / (double)1000 + "초");
//		System.out.println("소요시간 : "+ (end - start) / 1000. + "초");  // ---> 꼼수
		
		
		
		
		
		
		
		
		
	}

}
