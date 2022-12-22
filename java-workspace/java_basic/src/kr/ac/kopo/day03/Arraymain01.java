package kr.ac.kopo.day03;

public class Arraymain01 {
	
	public static void main(String[] args) {
		
		// int 정수를 5개 가지는 배열 arr 생성
		int[] arr = new int[5];
		
		//초기화하지 않아도 heap영역에 생성되는 변수는 0의 값을 갖는다.
		System.out.println("첫번째 값 : " + arr[0]);
		System.out.println("두번째 값 : " + arr[1]);
		System.out.println("세번째 값 : " + arr[2]);
		System.out.println("네번째 값 : " + arr[3]);
		System.out.println("다섯번째 값 : " + arr[4]);
		
		System.out.println();
		
		
		
		// 배열 크기 확인
		System.out.println("배열의 크기 : " +arr.length + "개");
		
		System.out.println();
		
		
		
		// 반복문 사용
		for(int i = 0; i < 5; i++) {
			System.out.println(i + "번쩨 정수 : " + arr[i]);
		}
				
		System.out.println();
		
		
		
		// 주소값 확인
		System.out.println("arr : " + arr);
		
		
		
		// 규모가 큰 것을 유지보사할 때 주로 사용하는 java. 변수에 덜 민감하게(유연하게) 코딩해야한다.
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번쩨 정수 : " + arr[i]);
		}
		
		
		
		// 첫번째 마지막요소까지 10, 20, 30, 40 50 대입
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
			System.out.println(i + "번쩨 정수 : " + arr[i]);
		}
		
		
		
		/*
		 	키보드로 5개의 정수를 입력받아 출력하는 코드 작성
		 	num1 : 45
		 	num2 : 34
		 	num3 : 892
		 	num4 : 9
		 	num5 : 100
		 	
		 	< 5개의 정수 출력 > --> 값을 모두 저장할 필요가 있을 때만 배열 사용
		 	45 34 892 9 100
		 	
		 	
		 */
		
	}

}
