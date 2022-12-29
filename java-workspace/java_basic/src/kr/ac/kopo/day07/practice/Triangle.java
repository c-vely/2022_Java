package kr.ac.kopo.day07.practice;

public class Triangle extends Polygon{
	
	
	public Triangle(String name, int width, int height) {
		super(name, width, height);	
//		this.name = "삼각형";
				
		setArea(width * height * 0.5);		
	}
	
	@Override
	public void prnArea() {
		System.out.println("밑변 " + width + ", 높이 " + height + "의 " + name + "의 넓이는 " + getArea());
	}

}
