package kr.ac.kopo.day08.abs01;

import java.util.Scanner;

public class Menu {
	
	int choice() {
		System.out.println("출력할 프린터를 선택하세요(1.삼성 2.LG) => ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		return no;
	}
	
	void print() {
		
		int no = choice();
		
		switch(no) {
		case 1:
			SamsungPrinter sam = new SamsungPrinter();
//			sam.samPrint(); // --> 상속 받지 않았을 때
			sam.print();	// --> 상속 받았을 때
			break;
		case 2:
			LGPrinter lg = new LGPrinter();
//			lg.lgPrint();   // --> 상속 받지 않았을 때
			lg.print();		// --> 상속 받았을 때
			break;
		}
		
		
		
	}

}
