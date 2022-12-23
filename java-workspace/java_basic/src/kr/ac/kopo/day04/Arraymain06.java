package kr.ac.kopo.day04;

import java.util.Arrays;

public class Arraymain06 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int[] brr = new int[5];	
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr : " + Arrays.toString(brr));
		
		System.arraycopy(arr, 2, brr, 0, 5);
		
		
		System.out.println("--------------------------------------");
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("brr : " + Arrays.toString(brr));
		
	}

}
