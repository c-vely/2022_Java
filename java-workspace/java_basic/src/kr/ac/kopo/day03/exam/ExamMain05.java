package kr.ac.kopo.day03.exam;

/*
----*
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

public class ExamMain05 {
	
	public static void main(String[] args) {
				
		// for문 5개 + if문 1개
		// 홀수를 만드는 수열은 2N+1 or 2N-1 선택해서 별을 기준으로 계산
		for(int i = 1; i <= 9; i++){	
			if(i <= 5) {
				for(int j = 1; j <= 5-i; j++) {
					System.out.print('-');					
				}
				for(int j = 1; j <= (i*2)-1; j++) {  // 2*(i-1)+1 ==(i*2)-1
					System.out.print('*');
				} 
			}else {
				for(int j = 1; j <= i-5; j++) {
					System.out.print('-');					
				}
				for(int j = 1; j <= 2*(9-i)+1; j++) {
					System.out.print('*');
				}
			}
			System.out.println();	
		}
		
		
		// 교수님) 9 x 9 박스라고 생각한다면?
		
		
		
		
		
		
		
		
		
		
		// for문 3개 + if문 3개
		
		// for문 2개 + if문 2개
		
		
	}
		
}		
		
		
		
		
	
		
	

