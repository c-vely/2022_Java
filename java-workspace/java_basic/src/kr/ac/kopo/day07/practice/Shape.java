package kr.ac.kopo.day07.practice;

public class Shape {
	
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
	
	public void prnArea() {
		
	}

}
