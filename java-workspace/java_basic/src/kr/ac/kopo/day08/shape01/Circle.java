package kr.ac.kopo.day08.shape01;


public class Circle extends Shape{
	
	private int radius;
	private double PI = 3.141592;

	
	Circle(String name, int radius) {
		super(name);
		this.radius = radius;	
		setArea(radius * radius * PI);				
	}

	@Override
	public void prnArea() {
		System.out.println("반지름 " + radius + "의 " + name + "넓이는 " + getArea());
	}
	
	

}
