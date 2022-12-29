package kr.ac.kopo.day08;

public class Child02 extends Parent{
	
	int age;
	String hobby;
	
	Child02(){
		name = "자식02";
		age = 17;
		hobby = "게임";
	}
	
	void play() {
		System.out.println("나는 놉니다");
	}
	
	void sing() {
		System.out.println("나는 노래를 부릅니다");
	}
	
	@Override
	void print() {
		System.out.println("나는 Child02입니다.");
	}

}
