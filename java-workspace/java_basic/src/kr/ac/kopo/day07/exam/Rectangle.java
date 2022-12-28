package kr.ac.kopo.day07.exam;

public class Rectangle extends Ploygon {
	
	Rectangle(String name, int width, int hight){
		super(name, width, hight);
	}
	
	@Override
	void areaCal() {
		area = width * hight;	
		System.out.println("가로 " +  width + ", 세로" + hight + "인 직사각형의 넓이는 "+ area + "입니다.");
		
	}

}
