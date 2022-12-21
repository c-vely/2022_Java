package kr.ac.kopo.day02;

/*
 * 한바퀴 뛸 차례다. 
 * while(!열바퀴 다 뛰었니?) {
		운동장 한 바퀴 뛴다
		바퀴수 증가
	}
	
	1.init
	while(2.expr) {
		3.statement1
		4. incre/decre
	}
	5. statement2
	
	1 -> 2 조건 참  -> 3 -> 4
	  -> 2 조건 참  -> 3 -> 4
	  -> 2 조건 참  -> 3 -> 4
	  -> 2 조건 거짓 -> 5		
	  
	  
	
	
  *	for(1.init; 2.expr; 4.incre/decr){
		3.statement1
	}
	5.statement2
	
	 1 -> 2 조건 참    -> 3 -> 4
	   -> 2 조건 참    -> 3 -> 4
	   -> 2 조건 참    -> 3 -> 4
	   -> 2 조건 거짓   -> 5
	
	
	
	
	
 */


public class LoopMain01 {
	public static void main(String[] args) {
		
		int cnt = 1;
		while(cnt <= 5)
		{
			System.out.println("hello");
			++cnt;
		}
		System.out.println("cnt : " +  cnt);
		
		
		
	}

}
