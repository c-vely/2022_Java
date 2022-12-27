package kr.ac.kopo.day06;

public class Employee {
	
	String name;
	String grade;
	int salary;
	static int employeeCnt; //총 사원수 (인스턴스 객체 모두 공유해서 쓸 것이기 때문에 static)
	
	Employee(){
		Employee.employeeCnt++;		
	}
	
	Employee(String name, String grade, int salary){
		this(); //같은 이름의 생성자를 오버로딩하고 싶을 때 this() 쓴다.
		this.name = name;
		this.grade = grade;
		this.salary = salary;			
	}
	
	void info( ) {
		System.out.println("사원명 : "+ name + ", 직급 : " +  grade + ", 연봉  : " + salary + "만원");		
	}
		
	static void employeeCntInfo() {
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
	}
	
	
	

}
