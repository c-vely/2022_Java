package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		// 1) 얕은 복사 (Shallow copy)
		int[] brr = arr;	
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr : " + Arrays.toString(brr));
		
		arr[0] = 200;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr : " + Arrays.toString(brr));
				
		System.out.println("--------------------------------------");		
		
		// 2) 깊은 복사 (Deep copy)
		int[] brr1 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			brr1[i] = arr[i];
		}
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr1 : " + Arrays.toString(brr1));
		
		arr[0] = 300;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr1 : " + Arrays.toString(brr1));
			
		System.out.println("--------------------------------------");
				
		// 3) 깊은 복사 -> 배열관련 제공 API (System.arraycopy)
		int[] brr2 = new int[arr.length];		
		System.arraycopy(arr,  0, brr2,  0,  arr.length);
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr2 : " + Arrays.toString(brr2));
		
		arr[0] = 400;		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr2 : " + Arrays.toString(brr2));
		
		
	}
}
