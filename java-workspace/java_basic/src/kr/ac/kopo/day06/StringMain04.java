package kr.ac.kopo.day06;

import java.util.Arrays;

public class StringMain04 {
	
	public static void main(String[] args) {
		
		String str = "Hello World"; //원본은 안 바뀜
		
		// 한 글자 찾기
		char ch = 'r';		
		int index = str.indexOf(ch);		
		System.out.printf("검색하신 문자 [%c]는 [%d]번째 위치에 있습니다.\n", ch, index);		
		System.out.println();
		
		
		// 2 글자 찾기  --> -1이 반환되면 찾으려는 문자가 없다는 것.
		String searchStr = "ll";
		index = str.indexOf(searchStr);
		System.out.printf("문자열 [%s]는 [%d]번째 위치에 있습니다.\n", searchStr, index);
		System.out.println();
		
		
		// 부분 문자 반환
		String subStr = str.substring(3, 8); // 3~7인덱스까지 출력
		System.out.println("substring(3, 8) : " + subStr);
		subStr = str.substring(3);
		System.out.println("substring(3) : " + subStr);
		System.out.println();
		
		
		// 치환된 문자열 반환
		System.out.println("str : " + str);
		// 1) 문자 치환
		String repStr = str.replace('o', 'O');
		System.out.println("replace('o' -> 'O') str : " + repStr);
		System.out.println();
		// 2) 문자열 치환
		repStr = str.replace("l", "rr");
		System.out.println("replace('l' -> 'rr') str : " + repStr);
		
		
		// 소문자, 대문자 변환
		System.out.println("대문자 변환 : " + str.toUpperCase());
		System.out.println("소문자 변환 : " + str.toLowerCase());
		System.out.println();
		
		
		// 문자 분리
		str = "010-1111-2222";
		String[] strArr = str.split("-");
		System.out.println("split('-') : " + Arrays.toString(strArr));
		System.out.println();
		
		
		// 문자열 결합
		String conArr = str.concat("nooooou");
		System.out.println("concat('nooooou') : " + conArr);
		System.out.println();
		
		
		// 문자열로 변환(valueOf)
		double num = 12.34;
		System.out.printf("실수 : %f\n", num);
		System.out.printf("valueOf(num) : %s\n", String.valueOf(num));
		System.out.println();
		
		String strNum = String.valueOf(num);  //실수 -> 문자열 변환 (정식)
//		String strNum = num + ""; // 꼼수
		System.out.print(strNum);
		
		
		
		
	}
}
