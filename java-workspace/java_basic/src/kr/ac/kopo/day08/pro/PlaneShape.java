package kr.ac.kopo.day08.pro;

public abstract class PlaneShape extends Shape {

	private int height;
	private int width;
	
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}



	public PlaneShape(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
}
