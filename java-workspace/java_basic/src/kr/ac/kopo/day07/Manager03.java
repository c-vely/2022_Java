package kr.ac.kopo.day07;

public class Manager03 extends Employee {
	
	Employee[] empList;
	
	// 기본생성자 : Source > Constructors from Superclass
	public Manager03() {
		super();		
	}

	// 멤버변수 : Source > Constructors using Fields
	public Manager03(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}
	
	// 오버라이드 : Source > Override/Implement Methods
	@Override
	void info() {		
		super.info();
	}

}
