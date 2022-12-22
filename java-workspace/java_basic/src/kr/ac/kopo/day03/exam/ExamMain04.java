package kr.ac.kopo.day03.exam;

/*
 	*
 	**
 	***
 	****
 	*****
 	****
 	***
 	**
 	*
 */

public class ExamMain04 {
	
	public static void main(String[] args) {
		
		
		// for문 3개 + if문
		for(int i = 1; i <= 9; i++){	
			if(i <= 5) {
				for(int j = 1; j <= i; j++) {
					System.out.print('*');
				}			
			} else {
				for(int j = 1; j <= 10-i; j++) {
					System.out.print('*');
				}			
			}
			System.out.println();
		}		
		System.out.println();
		System.out.println();
		
		
		
		// 교수님 (for문 2개 + if문)
		int nStar = 1; //한 행에서 출력할 별의 개수
		for(int i = 1; i <= 9; i++){	
			for(int j = 1; j <= nStar; j++) {
				System.out.print('*');
			}
			System.out.println();
			
			if(i < 5) {
				++nStar;
			} else {
				--nStar;
			}
		}		
		System.out.println();
		System.out.println();
	
	}
}
