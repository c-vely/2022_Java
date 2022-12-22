package kr.ac.kopo.day02.exam;

/*
1. 1 ~ 100 정수 출력
< 1 ~ 100사이의 정수 출력>
1 2 3 4 ... 98 99 100

2. 100 ~ 1 사이의 정수 출력
< 100 ~ 1 사이의 정수 출력 >
100 99 98 97 ... 3 2 1

3. 1 ~ 100 사이의 홀수 출력
< 1 ~ 100 사이의 홀수 출력 >
1 3 5 7 9 11 ... 98 97 99

4. 100 ~ 1사이의 짝수 출력, 단 한라인에 정수 5개씩 출력
< 100 ~ 1 사이의 짝 수 출력 >
100 98 96 94 92
90 88 86 84 82
*/

public class ExamMain03 {
	
	public static void main(String[] args) {
		
		// 1.
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		// 2.
		for(int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		// 3.
		for(int i = 1; i <= 100; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		// 3. 교수님
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");				
			}
		}
		System.out.println();
		System.out.println();
		
		// 4.
		int cnt = 0;
		for(int i = 100; i >= 1; i-=2) {
			if(cnt == 5) {
				System.out.println();
				cnt = 0;
			}
			System.out.print(i + " ");				
			cnt++;
		}
		System.out.println();
		System.out.println();
		
		// 4. 교수님
		for(int i = 100; i >= 1; i-=2) {
			System.outonly.print(i + " ");				
			if(++cnt % 5 == 0) {
				System.out.println();				
			}
		}
		System.out.println();
		System.out.println();
		
		
	}

}
