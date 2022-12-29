package kr.ac.kopo.day08.shape01;

import java.util.Random;

public class Menu {
	int ranNum1 = 1;
	int ranNum2 = 1;
	
	Random r = new Random();
	
	int randomChoice() {		
		System.out.println(" < 도형의 넓이 출력 프로그램 >");
		System.out.println("1.삼각형	2.정사각형	 3.직사각형  4.원");		
		int choice  = r.nextInt(4) + 1;		
	    System.out.println("choicNum = " +  choice);
	    return choice;
	}
	
	int randomPick() {			
		int num = r.nextInt(8) + 2;			
		System.out.println("ramdomSize : " +  num);	
		return  num;			
	}
	
	void print() {
		
		int no = randomChoice();
		Shape s = null;
		
		switch(no) {
		case 1:
			ranNum1 = randomPick();
			ranNum2 = randomPick();
			s = new Triangle("삼각형", ranNum1, ranNum2);			
			break;
		case 2:
			ranNum1 = randomPick();
			s = new Square("정사각형", ranNum1);
			break;
		case 3:
			ranNum1 = randomPick();
			ranNum2 = randomPick();
			s = new Rectangle("직사각형", ranNum1, ranNum2);;
			break;
		case 4:
			ranNum1 = randomPick();
			s = new Circle("원형", ranNum1);
			break;
		}	
		
		if(s != null) {
			s.prnArea();				
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	

}
