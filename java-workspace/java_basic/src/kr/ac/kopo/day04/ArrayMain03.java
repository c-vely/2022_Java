package kr.ac.kopo.day04;

public class ArrayMain03 {
	
public static void main(String[] args) {
		
		// 어제 복습
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
				
		
		// 1) 배열 초기화 방법 - 선언과 동시에만 할 수 있음
		int[] arr1 = {10, 20, 30, 40, 50}; 
//		arr1 = {10, 20, 30, 40, 50};  //  <---  Error
		
		// 2) 배열 초기화 방법 (유연) - 자바에서 코드는 가상메모리를 가르키고 있어서 연결이 끊기면 가비지컬렉터가 알아서 지워줌. 메모리 누수 부분을 덜 신경쓸 수 있다. 하지만 언제 가비지컬렉터를 작동할지 모름. 명령을 내려도 언제 실행할지 모름
		int[] arr2 = new int[] {10, 20, 30, 40, 50};		
		arr2 = new int[] {100, 200, 300, 400, 500}; //  <--- 다시 할당할 수 있음(새로운 메모리가 생김. 가비지콜렉터 덕분에 메모리 누수 신경x)
						
		
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
