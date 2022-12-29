package kr.ac.kopo.day08.shape01;

public class Rectangle extends Polygon{

	
	Rectangle(String name, int width, int height) {
		super(name, width, height);	
		setArea(width * height);
	}

	@Override
	public void prnArea() {
		System.out.println("가로 " + width + ", 세로 " + height + "의 " + name + "의 넓이는 " + getArea());
		
	}

}
