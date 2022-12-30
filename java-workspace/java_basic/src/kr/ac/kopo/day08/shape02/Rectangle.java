package kr.ac.kopo.day08.shape02;

public class Rectangle extends PlaneShape {

	public Rectangle(int width, int height) {
		super(width, height);
		name = "직사각형";
	}
	
	
	private void setArea() {
		double area = super.getHeight() * super.getWidth();
		super.setArea(area);
	}

	
	@Override
	public void printArea() {
		setArea();
		System.out.printf("%s(가로 : %d, 세로 : %d) 넓이 : %f\n",
				name, getWidth(), getHeight(), getArea());
	}

}