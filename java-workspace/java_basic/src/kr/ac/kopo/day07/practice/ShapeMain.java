package kr.ac.kopo.day07.practice;

import java.util.Random;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		int randomNum1 = 1;
		int randomNum2 = 1;
		
		Random r = new Random();
		
		System.out.println(" < 도형의 넓이 출력 프로그램 >");
		System.out.println("1.삼각형	2.정사각형	 3.직사각형  4.원");		
		int choice  = r.nextInt(4) + 1;
		
	    System.out.println("choicNum = " +  choice);
		
		
		switch(choice) {
		case 1:
			randomNum1 = randomPick();
			randomNum2 = randomPick();
			Triangle t = new Triangle("삼각형", randomNum1, randomNum2);
			t.prnArea();
			break;
		case 2:
			randomNum1 = randomPick();
			Square s = new Square("정사각형", randomNum1, randomNum2);
			s.prnArea();
			break;
		case 3:
			randomNum1 = randomPick();
			randomNum2 = randomPick();
			Rectangle rec = new Rectangle("직사각형", randomNum1, randomNum2);
			rec.prnArea();
			break;
		case 4:
			randomNum1 = randomPick();
			Circle c = new Circle("원형", randomNum1);
			c.prnArea();
			break;		
		}						
	}
	
	
	static int randomPick() {		
		Random r = new Random();	
		int num = r.nextInt(8) + 2;	
		
		System.out.println("ramdomSize : " +  num);
	
		return  num;		
		
	}

}
