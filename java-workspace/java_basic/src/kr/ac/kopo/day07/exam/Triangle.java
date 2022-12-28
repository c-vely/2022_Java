package kr.ac.kopo.day07.exam;

public class Triangle extends Ploygon {
	
	Triangle(String name, int width, int hight){
		super(name, width, hight);
	}
	
	@Override
	void areaCal() {
		super.area = (width * hight) * 0.5;	
		System.out.println("밑변 " +  width + ", 높이" + hight + "인" );
		super.areaCal();
		
	}
	
	

}
