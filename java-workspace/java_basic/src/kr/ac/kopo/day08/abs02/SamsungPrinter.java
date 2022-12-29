package kr.ac.kopo.day08.abs02;

//Printer 추상클래스 상속 받기
public class SamsungPrinter extends Printer{
	
	String modelNo;

	
	@Override
	void print() {
		// TODO Auto-generated method stub		
		System.out.println("삼성프린터에서 출력합니다.");		
	}
	
	


}
