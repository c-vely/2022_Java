package kr.ac.kopo.day05;

public class StringMain02 {

	public static void main(String[] args) {
		
		String s = new String("Hello World");
		
		System.out.printf("[%s] 길이 : %d\n", s, s.length());
		
		System.out.println("3번지에 위치한 문자 : " + s.charAt(3));
		System.out.println("7번지에 위치한 문자 : " + s.charAt(7));
//		System.out.println("12번지에 위치한 문자 : " + s.charAt(12));
		
		String s2 = "Hello";
		String s3 = "Hello";
		
		s2 = new String("Hello");
		s3 = new String("Hello");
		
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		// 주소비교
		if(s2 == s3) {
			System.out.println("== : 같다");
		} else {
			System.out.println("== : 다르다");
		}
		
		boolean bool = s2.equals(s3);
		if(bool) {
			System.out.println("equals() : 같다");
		} else {
			System.out.println("equals() : 다르다");
		}
		
		System.out.println("Hello, hello 비교 : " + "Hello".equals("hello"));
		System.out.println("Hello, hello 비교 : " + "Hello".equalsIgnoreCase("hello"));
	}
}




