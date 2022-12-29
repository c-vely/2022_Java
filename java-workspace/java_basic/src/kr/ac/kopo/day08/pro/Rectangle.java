package kr.ac.kopo.day08.pro;

public class Rectangle extends PlaneShape {

		
	public Rectangle(int height, int width) {
		super(height, width);
		name = "직사각형";
	}
	
	private void setArea() {
		double area = super.getHeight() * super.getWidth();
		setArea(area);
	}

	@Override
	public void printArea() {
		setArea();
		System.out.printf("%s(가로 : %d, 세로 : %d) 넓이 : %f\n",
				name, getWidth(), getHeight(), getArea());
	}
	
	

	
}
