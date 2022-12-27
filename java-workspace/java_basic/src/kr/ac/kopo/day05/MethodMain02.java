package kr.ac.kopo.day05;

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		Method m2 = new Method();
		
		System.out.println(m);
		System.out.println(m2);
		
		m.call();
		m.call(10);
		m.call(123, 'A');
		m.call("hello");
		m.call2();
		
		System.out.println(true);
		System.out.println(10);
		System.out.println("hello");
		
	}
}








