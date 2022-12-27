package kr.ac.kopo.day05.exam;

public class MyStringMain {

	public static void main(String[] args) {
		
		MyString s = new MyString("Hello");
 		MyString s2 = new MyString("HeLLo");
 		
 		boolean bool = s.equalsIgnoreCase(s2);
 		if(bool) {
 		   System.out.println("같다");
 		} else {
 		   System.out.println("다르다");
 		}
		
	}
}
