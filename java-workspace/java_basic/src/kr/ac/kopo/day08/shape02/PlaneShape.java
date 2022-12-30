package kr.ac.kopo.day08.shape02;

// 추상 클래스
public abstract class PlaneShape extends Shape {
	
	private int width;
	private int height;
	
	
	
	public PlaneShape(int width, int height) {
		this.setHeight(height);
		this.setWidth(width);
	}


	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
