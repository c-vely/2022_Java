package kr.ac.kopo.day08.abs02;


// 추상 클래스
public abstract class Printer {
	
	// 강제성 O
	String model;
	
	void info() {
		System.out.println("모델명 : " + model);
	}
	
	// 추상 메소드 (선언만 함)
	abstract void print() ;
	
	

}
