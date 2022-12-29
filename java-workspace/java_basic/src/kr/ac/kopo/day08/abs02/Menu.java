package kr.ac.kopo.day08.abs02;

import java.util.Scanner;

public class Menu {
	
	int choice() {
		System.out.println("출력할 프린터를 선택하세요(1.삼성 2.LG 3.HP) => ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		return no;
	}
	
	/*
	// 2) + 객체 오버로딩  ---> me
	void print(Printer p) {
		if(p instanceof SamsungPrinter) {		
			SamsungPrinter s = (SamsungPrinter)p;
			s.print();
			
		} else if (p instanceof LGPrinter) {
			LGPrinter l = (LGPrinter)p;
			l.print();
			
		} else if (p instanceof HPPrinter) {
			HPPrinter h = (HPPrinter)p;
			h.print();
		}		
	}
	*/
	
	/*
	// 1) 추상클래스 상속
	void print() {
		
		int no = choice();
		
		switch(no) {
		case 1:
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();	// --> 상속 받았을 때
			break;
		case 2:
			LGPrinter lg = new LGPrinter();
			lg.print();		// --> 상속 받았을 때
			break;
		case 3:
			HPPrinter hp = new HPPrinter();
			hp.print();		// --> 상속 받았을 때
			break;
		}
		*/
	
		/*
		// 2) + 다형성 (묵시적 & 명시적 형변환)  ---> me
		void print() {
			
			int no = choice();
			
			switch(no) {
			case 1:
				print(new SamsungPrinter());
				break;
			case 2:
				print(new LGPrinter());				
				break;
			case 3:
				print(new HPPrinter());								
				break;
			}
			*/
	
	
		// 3) 교수님  + 다형성 + 예외처리
		void print() {
			
			int no = choice();
			Printer p = null;
			
			switch(no) {
			case 1:
				p = new SamsungPrinter();			
				break;
			case 2:
				p = new LGPrinter();
				break;
			case 3:
				p = new HPPrinter();
				break;				
			}	
			
			if(p != null) {
				p.print();				
			} else {
				System.out.println("잘못 입력했습니다.");
			}
								
	}	
		
		
		

}
