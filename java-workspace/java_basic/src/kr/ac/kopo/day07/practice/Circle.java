package kr.ac.kopo.day07.practice;


public class Circle extends Shape{
	
	private int radius;
	private static final double PI = 3.141592;
	
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
		
		setArea(radius * radius * Circle.PI);		
	}
	
	@Override
	public void prnArea() {
		System.out.println("반지름 " + radius + "의 " + name + "넓이는 " + getArea());
	}

}
