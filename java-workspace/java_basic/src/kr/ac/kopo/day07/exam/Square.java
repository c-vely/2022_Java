package kr.ac.kopo.day07.exam;

public class Square extends Rectangle {
	
	Square(String name, int width, int hight){
		super(name, width, hight);
	}

	@Override
	void areaCal() {
		super.area = width * width;	
		System.out.println("가로, 세로 길이가 " +  width + "인 ");
		super.areaCal();
	}
	
	

}
