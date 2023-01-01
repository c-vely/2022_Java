package kc.ac.kopo.day09;

public class Employee {
	
	private int no;
	private String name;
	private int salary;
	private String grade;
	
	
	public Employee(int no, String name, int salary, String grade) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	
	// getter 메소드 (무조건 public) --> 내 객체가 가지고 있는 멤버변수의 값을 외부에 보여주는 것
	public int getNo() {
		return this.no;
	}
	// setter 메소드 (무조건 public) --> 내 객체의 멤버변수의 값을 설정하는 것
	public void setNo(int no) {
		this.no = no;
	}
		
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		
	
	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " +  grade);
	}



	

	
	/*
	// 1) Object 클래스 메소드 호출할 때, 내 맘대로 재정의해서 쓸수도 있음 ==> 좀 귀찮음
	@Override
	public String toString() {
		return "사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " +  grade;		
	}
	*/
	
	
	// 2) 자동 완성 (Source > Generate toString() > 사용할 변수 클릭 > Generate)
	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", salary=" + salary + ", grade=" + grade + "]";
	}
	
	
	

}
