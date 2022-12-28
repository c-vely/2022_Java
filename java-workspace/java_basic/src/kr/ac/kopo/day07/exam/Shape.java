package kr.ac.kopo.day07.exam;

public class Shape {
	
	double area;
	String name;
	
	Shape() {}
	
	Shape(String name){
		this.name = name;
	}
	
	void areaCal() {
		System.out.println(name + "의 넓이는 "+ area + "입니다.");
	}

}
