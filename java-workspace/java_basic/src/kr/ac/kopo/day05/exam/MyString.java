package kr.ac.kopo.day05.exam;

public class MyString {

	String str;
	
	MyString(String str) {
		this.str = str;
	}
	
	char toUpper(char c) {
		if(c >= 'a' && c <= 'z')
			return c -= ('a' - 'A');
		return c;
	}
	
	boolean equalsIgnoreCase(MyString other) {
		
		if(str.length() != other.str.length()) {
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char oriChar = str.charAt(i);
			char otherChar = other.str.charAt(i);
			if(toUpper(oriChar) != toUpper(otherChar))
				return false;
			
		}
		
		return true;
	}
	
}

/*
 		MyString s = new MyString("Hello");
 		MyString s2 = new MyString("Hello");
 		
 		boolean bool = s.equals(s2);
 		if(bool) {
 		   System.out.println("같다");
 		} else {
 		   System.out.println("다르다");
 		}
*/
