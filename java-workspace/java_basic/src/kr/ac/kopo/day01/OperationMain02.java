package kr.ac.kopo.day01;

public class OperationMain02 {
	public static void main(String[] args) {
				
		// 1)
//		int a = 1, b = -1, c = 0;
//		System.out.println(++a > 0 && ++b > 0 && ++c > 0);
//		System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
		
		// 2)
		int a = 1, b = -1, c = 0;
		System.out.println(++a > 0 || ++b > 0 && ++c > 0);
		System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
		
		
	}

}
