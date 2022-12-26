package kr.ac.kopo.day04.exam;
/*
3. 다음과 같은 결과를 보이는 프로그램 작성

- 총 몇개의 아이스크림을 구매하시겠습니까? 3 (입력)

*** 1번째 아이스크림 구매 ***
아이스크림 이름 : 비비빅 (입력)
아이스크림 가격 : 1000 (입력)

*** 1번째 아이스크림 구매 ***
아이스크림 이름 : 월드콘 (입력)
아이스크림 가격 : 2000 (입력)

*** 1번째 아이스크림 구매 ***
아이스크림 이름 : 붕어싸만코 (입력)
아이스크림 가격 : 1500 (입력)

< 총 3개의 아이스크림 구매정보 출력>
번호   아이스크림 이름   아이스크림 가격
1     비비빅         1000
2     월드콘         2000
3     붕어싸만코       1500 
 */

 import java.util.Scanner;

public class ExamMain03 {
	
	public static void main(String[] args) {
		
			int num = 0;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 몇 개의 아이스크림을 구매하시겠습니까? ");
		num = sc.nextInt();
		
		String str[] = new String[num];
		int price[] = new int[num];
				
		for(int i = 0; i < num; i++) {
			System.out.println("***" + (i+1) + "번째 아이스크림 구매 ***");
			System.out.println("아이스크림명 : ");
			str[i] = sc.next();
			System.out.println("아이스크림가격 : ");
			price[i] = sc.nextInt();
			
		}
		
		System.out.println("< 총 " + num + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호  " + "아이스크림명  " + "아이스크림가격");
		
		for(int i = 0; i < num; i++) {
			System.out.println((i+1) + "     " + str[i] + "     " + price[i]);
			
		}
		
	}

}
