package kr.ac.kopo.day08.shape02;

import java.util.Random;

public class ShapeVendor {
	
	private Random r;
	
	public ShapeVendor() {
		r = new Random();
	}
	
	
	
	private int choiceShape() {
		System.out.println("1.삼각형  2.직사각형  3.정사각형  4.원)");
		int num = getRandomNum(1, 4);
		System.out.println("1 - 4 추출된 정수 : " + num);
		return num;
	}
	private int getRandomNum(int start, int end) {
		return r.nextInt(end-start) + start;
	}
		
	
	
	private Shape getShape(int type) {
		Shape shape = null;
		switch(type) {
		case 1 :
			shape = new Triangle(getRandomNum(2, 10), getRandomNum(2, 10));
			break;
		case 2 : 
			shape = new Rectangle(getRandomNum(2, 10), getRandomNum(2, 10));
			break;
		case 3 : 
			shape = new Square(getRandomNum(2, 10));
			break;
		case 4 : 
		default : 
			shape = new Circle(getRandomNum(2, 10));
			break;
		}		
		return shape;
	}
	
		
	
	public void process() {
		int type = choiceShape();
		Shape shape = getShape(type);
		shape.printArea();		
	}

}
