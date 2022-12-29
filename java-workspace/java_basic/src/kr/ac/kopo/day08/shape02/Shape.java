package kr.ac.kopo.day08.shape02;

// 추상 클래스
public abstract class Shape {
	
	private double area;
	String name;
	
	
	
	// 불러서 값을 입력하고 읽어야 하기에 Public으로 지정
	public void setArea(double area) {
		this.area = area;
	}	
	public double getArea() {
		return area;
	}
	
	
	// 추상 메소드
	public abstract void printArea();
	

}
