package kr.ac.kopo.day07.exam;

public class Circle extends Shape {
	
	int radius;
	double pi = 3.14;

	
	Circle(String name, int radius) {		
		super.name = name; 		
		this.radius = radius;
	}
	
	@Override
	void areaCal() {
		super.area = pi * radius;	
		System.out.println("반지름이 " +  radius + "인 ");
		super.areaCal();		
	}
	
	

}
