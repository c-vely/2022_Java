package kr.ac.kopo.day08.shape01;

// 추상 클래스
public abstract class Shape {
	
	private double area;
	protected String name;	
	
	Shape(String name){
		this.name = name;
	}
	
	
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	//추상 메소드
	public abstract void prnArea();


}
