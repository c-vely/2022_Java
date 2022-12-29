package kr.ac.kopo.day08.abs02;

// Printer 추상클래스 상속 받기
public class LGPrinter extends Printer{
	
	String model;

	
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("LG프린터에서 출력합니다.");
	}
	

	

}
