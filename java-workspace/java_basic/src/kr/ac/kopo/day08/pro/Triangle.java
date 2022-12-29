package kr.ac.kopo.day08.pro;

public class Triangle extends PlaneShape {

	public Triangle(int height, int width) {
		super(height, width);
		name = "삼각형";
	}
	
	private void setArea() {
		double area = super.getHeight() * super.getWidth() / 2;
		setArea(area);
	}

	@Override
	public void printArea() {
		setArea();
		System.out.printf("%s(밑변 : %d, 높이 : %d) 넓이 : %f\n",
				name, getWidth(), getHeight(), getArea());
	}
	
	

	
}
