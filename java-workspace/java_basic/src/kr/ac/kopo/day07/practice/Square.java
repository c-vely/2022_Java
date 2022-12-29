package kr.ac.kopo.day07.practice;

public class Square extends Rectangle {
	
	Square(String name, int width, int height){
		super(name, width, height);
//		this.name = "정사각형";
		
		setArea(width * height);		
	}
	
	@Override
	public void prnArea() {
		System.out.println("한변 " + width + "의 " + name + "의 넓이는 " + getArea());
	}

}
