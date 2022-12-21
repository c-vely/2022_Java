package kr.ac.kopo.day02;

public class IFMain04 {
	
	public static void main(String[] args) {
		
		int time = 810;
		
		System.out.println("기상한다");
		
		if(time < 800) {
			System.out.println("걸어서");
		} else if(time < 815) {
			System.out.println("버스타고");
		} else {
			System.out.println("택시타고");
		}
		
		System.out.println("학교간다");
	}

}
