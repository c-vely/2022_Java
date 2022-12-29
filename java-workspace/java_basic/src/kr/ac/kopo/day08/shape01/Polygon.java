package kr.ac.kopo.day08.shape01;

// 추상 클래스
public abstract class Polygon extends Shape{
	
	protected int width;
	protected int height;

	
	Polygon(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;	
	}

	
	

}
