package kr.ac.kopo.day05;

/*
 	생성자 특징
 	1. 클래스명 동일
 	2. 반환형이 없다
 	3. 디폴트생성자 지원
 	   (클래스내에 생성자가 존재하지 않으면 JVM 자동으로 생성  클래스명() {})
 	4. 오버로딩 지원
 	5. 객체 초기화 담당
 */

public class Dog {

	String name;
	int age;

	Dog() {
		System.out.println("Dog() 생성자 호출...");
	}
	
	Dog(String n) {
		System.out.println("Dog(String) 생성자 호출...");
	}
	
	Dog(String n, int a) {
		System.out.println("Dog(String, int) 생성자 호출...");
	}
}



