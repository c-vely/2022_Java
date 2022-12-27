package kr.ac.kopo.day05;

/**
 * 
 * 구구단과 관련된 메소드들을 모아놓은 클래스
 * @author PC
 *
 */
public class Gugudan {

	/**
	 * @param dan 출력할 구구단 단
	 */
	public void print(int dan) {
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	/**
	 * 전체 구구단(2~9단) 출력
	 */
	public void print() {
		
		this.print(2, 9);
	}
	
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param start 시작단
	 * @param end	종료단
	 */
	public void print(int start, int end) {
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
	}
}







