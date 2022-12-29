package kr.ac.kopo.day08.shape01;

public class Triangle extends Polygon{

	Triangle(String name, int width, int height) {
		super(name, width, height);
		
		setArea(width * height * 0.5);
	}
	
	@Override
	public void prnArea() {
		System.out.println("밑변 " + width + ", 높이 " + height + "의 " + name + "의 넓이는 " + getArea());
	}
	

}
