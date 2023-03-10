package kr.ac.kopo.day01;

public class HelloMain {
	
	public static void main(String[] args) {
		
		//println() 
		System.out.println("Hello Java");
		System.out.println("Bye~~");
		
		//print()
		System.out.print("Hello Java");
		System.out.print("Bye~~");
		
		System.out.print("Hello Java\n");  //--->println()씀
		System.out.print("Bye~~");
		
		
		//println() : 문자, 문자열, 정수, 실수, 논리값 출력
		System.out.println('A');
		System.out.println("Bye~~");
		System.out.println(123);
		System.out.println(12.34);
		System.out.println(true);
		
		
		//printf("변환문자") : %c 문자 / %s 문자열 / %d 정수 / %f 실수 / %b 논리값
		System.out.print(2022);
		System.out.print("년 내 학점은 ");
		System.out.print('A');
		System.out.print("다.\n");
		
		System.out.println(2022 + "년 내 학점은 " + 'A' + "다.");
		System.out.println(10 + " + " + 20 + " = " + (10+20));
		
		System.out.printf("%c\n", 'A');
		System.out.printf("%d\n", 123);
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
		System.out.printf("%d년 내 학점은 %c다\n", 2022, 'A');
		
		System.out.printf("참 : %b\n", 3==3);
		System.out.printf("참 : %b\n", 3==5);
		
		
		//정렬
		System.out.printf("[%6d]년 내 학점은 %c다\n", 2022, 'A');
		System.out.printf("[%-6d]년 내 학점은 %c다\n", 2022, 'A');
		
	
		
		

		
		
	}
	
	

}
