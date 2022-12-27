package kr.ac.kopo.day05;

public class Member {
	
	String name;
	int age;
	String phoneNumber;
	
	Member() {
		
	}
	
	Member(String name, int age) {
		this(name, age, "알수없음");
		/*
		this.name = name;
		this.age = age;
		this.phoneNumber = "알수없음";
		*/
	}
	
	Member(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	void info() {
		System.out.println("이름 : " + this.name + ", 나이 : " + age
							+ "살, 전화번호 : " + phoneNumber);
	}
}
