package kr.ac.kopo.day07;

// Manager01과 Employee 상속관계
// "Manager01은 Employee의 한 형태다"
public class Manager01 extends Employee {
	
	Employee[] empList; 	//관리사원목록
	
	Manager01(String name, int salary, String grade, Employee[] empList){ //---> 이런 접근은 좋지 않음. employee에서 표시하도록 하는 게 좋음
//		super(); //매개변수 없는 기본생성자를 호출함
		this.name = name; 	//부모까지 this로 포함됨
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + ", 직급 : " + grade);
		
		System.out.println("--------------------------------------");
		System.out.println("\t\t < 관리사원목록 > ");
		System.out.println("--------------------------------------");
		
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("--------------------------------------");
	}
}
