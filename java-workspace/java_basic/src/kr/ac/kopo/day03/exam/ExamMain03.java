package kr.ac.kopo.day03.exam;

/*
 	    *
 	   **
 	  ***
 	 ****
 	*****
 */

public class ExamMain03 {
	
	public static void main(String[] args) {
		
		// for문 3개
		for(int i = 1; i <=5; i++){	
			for(int j = 1;j <= 5-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		
		// for문 2개 + if문
		for(int i = 1; i <=5; i++){	
			for(int j = 1; j <=5; j++){	
				if(j < 6 - i) {
					System.out.print('-');					
				} else {
					System.out.print('*');					
					
				}
			}
			System.out.println();			
		}
		
	}

}
