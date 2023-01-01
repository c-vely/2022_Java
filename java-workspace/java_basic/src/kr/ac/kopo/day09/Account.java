package kc.ac.kopo.day09;

public class Account {	
	
	// 1) 생성자를 만들지 않아도 자동으로 생성자가 호출되면서 여러 개의 객체를 만들 수 있음
	private String name;
	private String id;
	private String bank;
	
	
	/*
	// 2) 생성자를 private로 만들면 객체가 1개만 만들어짐  ===> 디자인 패턴 중 싱글톤 
	private static Account ac = new Account();	// 바로 초기화 하는 방법
	
	private Account() {}				
	
	public static Account getInstance() {
//		return new Account();
		return ac;
	}
	*/
	
	
	
	
	/*
	// 3 - 1) 교수님 	
	private static Account obj;	
	
	private Account() {}				
	
	public static Account getInstance() {
		if(obj == null) {
			obj = new Account();
		}
		return obj;
	}
	*/
	
	// 3 - 2) 교수님
	private final static Account obj = new Account();	
	
	private Account() {}				
	
	public static Account getInstance() {
		return obj;
	}



}
