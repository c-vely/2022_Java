package kr.ac.kopo.day01;

/*
  첫번째 정수 입력 : 12
  두번째 정수 입력 : 4 
  4는 12의 약수여부 판단 : true
  
  첫번째 정수 입력 : 12
  두번째 정수 입력 : 5 
  5는 12의 약수여부 판단 : false
 */

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 6;
		
		//System.out.printf("%d는 %d의 약수여부 판단 : %b\n", b, a, a % b == 0);
		System.out.printf("%d는 %d의 약수여부 판단 : %b\n", b, a, b != 0 && a % b == 0);
		
		
		
	}

}
