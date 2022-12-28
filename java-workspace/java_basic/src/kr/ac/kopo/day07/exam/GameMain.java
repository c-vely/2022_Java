package kr.ac.kopo.day07.exam;

import java.util.Random;

public class GameMain {
	
	public static void main(String[] args) {
		
		int randomNum1 = 0;
		int randomNum2 = 0;
		
		Random r = new Random();
		
		System.out.println(" < 도형의 넓이 출력 프로그램 >");
		System.out.println("1.삼각형	2.정사각형	 3.직사각형  4.원");		
		int choice  = r.nextInt(4) + 1;
		
		
		switch(choice) {
		case 1:
			randomNum1 = randomPick();
			randomNum2 = randomPick();
			Triangle t = new Triangle("Triangle", randomNum1, randomNum2);
			t.areaCal();
			break;
		case 2:
			randomNum1 = randomPick();
			Square s = new Square("Square", randomNum1, randomNum2);
			s.areaCal();
			break;
		case 3:
			randomNum1 = randomPick();
			randomNum2 = randomPick();
			Rectangle rec = new Rectangle("Rectangle", randomNum1, randomNum2);
			rec.areaCal();
			break;
		case 4:
			randomNum1 = randomPick();
			Circle c = new Circle("Circle",randomNum1);
			c.areaCal();
			break;		
		}				
		
	}
	
	
	static int randomPick() {		
		Random r = new Random();	
		int num = r.nextInt(8) + 2;	
		return  num;
		
	}

}
