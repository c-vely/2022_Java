package kr.ac.kopo.day02;

public class IFMain03 {
	
	public static void main(String[] args) {
		
		int time = 730;
		
		System.out.println("기상한다");
		
		
		/* 1) 방법
		 if(time < 800) {
			 System.out.println("걸어서");
		 } else {
			 // 출발 시간이 8시 이후
			 if(time < 815) {
				 System.out.println("버스타고");				 
			 } else {
				 System.out.println("택시타고");
			 }		 
		 }		 
		 */
		
		/* 2) 방법
		 if(time < 815) {
			 if(time < 800) {
				 System.out.println("걸어서");		 
			 } else {
				 System.out.println("버스타고");
			 }	
			 
		  } else {
			 // 출발 시간이 8시 15분 이후
			 System.out.println("택시타고");			 
		  }	
		  */	 
		
		// 8시 이후 8시 15분이 이전 출발
//		if(800 <= time && time < 815 ) {
		if(time >= 800 && time < 815) {   //---> 변수를 왼쪽에 쓰는 것이 규약에 더 맞다
			System.out.println("버스타고");			
		}
		
		
		 System.out.println("학교간다");
	}

}
