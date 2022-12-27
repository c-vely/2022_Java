package kr.ac.kopo.day06;

public class StringMain03 {
	
	public static void main(String[] args) {
		
		String[] names = {"홍길동", "홍길순", "윤길동", "강길순", "김철수", "윤수길"};
		
		// 이름찾기
		System.out.println("< 이름이 홍길동인 회원 목록 출력 >");
		for(String name : names) {			
			// 1)
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
			// 2)
			if("홍길동".equals(name)) {
				System.out.println(name);
			}
		}
		
		// 한 글자 찾기
		System.out.println("< 홍씨 성을 가진 회원 목록 출력 >");
		for(String name : names) {	
			// 1) 앞이 홍이면
			if(name.charAt(0) == '홍') {
				System.out.println(name);
			}
			// 2) 홍으로 시작하는 모든 것
			if(name.startsWith("홍")) {
				System.out.println(name);
			}			
		}
		
		// 끝나는 이름이 이거니?
		System.out.println("< 이름이 길동인 회원 목록 출력 >");
		for(String name : names) {	
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		// 포함된 거 다 찾기
		System.out.println("< 길이 포함된 회원 목록 출력 >");
		for(String name : names) {	
			if(name.contains("길")) {
				System.out.println(name);
			}
		}
		System.out.println();
		System.out.println();
		
		
		
		String str = "apple";
		String str2 = "cat";
		
		// compareTo 글자수는 중요하지 않고, 사전에서 누가 더 뒤에 있냐로 크냐? 작냐?를 구분
		int cmp = str.compareTo(str2);
		System.out.println(cmp);
		
		if(cmp == 0) {
			System.out.println(str + " == " + str2);
		} else if(cmp > 0) {
			System.out.println(str + " > " + str2);
		} else {
			System.out.println(str + " < " + str2);
		}
		
		
		
		
	}

}
