package kr.ac.kopo.day08.shape01;

public class Square extends Polygon {

	Square(String name, int width) {
		super(name, width, width);
		setArea(width * width);
	}
	
	@Override
	public void prnArea() {
		System.out.println("한변 " + width + "의 " + name + "의 넓이는 " + getArea());
	}

}
