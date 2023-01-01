package kr.ac.kopo.day08.shape02;

public class Circle extends Shape {
	
	private int radius;
	private double PI = 3.141592;
	

	
	public Circle(int radius) {
		this.radius = radius;
		this.name = "원";
	}
	
	private void setArea() {
		double area = radius * radius * PI;
		super.setArea(area);
	}
	
	
	
	@Override
	public void printArea() {
		setArea();
		System.out.println("반지름 " + radius + "의 " + name + "넓이는 " + getArea());
	}

}
