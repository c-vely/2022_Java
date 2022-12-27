package kr.ac.kopo.day05;

public class StringMain01 {

	public static void main(String[] args) {
		
		String s = new String();
		
		char[] chars = {'A', 'B', 'C', 'D', 'E'};
		String s2 = new String(chars);
		String s3 = new String(chars, 1, 3);
		
		byte[] bytes = {97, 98, 99, 100};
		String s4 = new String(bytes);
		
		String s5 = new String("Hello World!!!");
		
		System.out.printf("[%s]\n", s);
		System.out.printf("[%s]\n", s2);
		System.out.printf("[%s]\n", s3);
		System.out.printf("[%s]\n", s4);
		System.out.printf("[%s]\n", s5);
	}
}
