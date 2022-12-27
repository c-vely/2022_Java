package kr.ac.kopo.day05;

/*
 * 메소드 오버로딩(Overloading)
   클래스내에 메소드명이 같으면서 매개변수의 개수나 타입을 다르게 정의하는 것
 */

public class Method {

	void call() {
		System.out.println("call() 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 호출...");
	}
	
	void call(int i, char c) {
		System.out.println("call(int, char) 호출...");
	}
	
	void call(String str) {
		System.out.println("call(String) 호출...");
	}
	
	void call2() {
		System.out.println("---------");
		call("hi");
		System.out.println("---------");
	}
	
}




