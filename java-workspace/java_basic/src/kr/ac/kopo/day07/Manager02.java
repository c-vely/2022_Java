package kr.ac.kopo.day07;

// Manager02과 Employee 상속관계 + 은닉성과 캠슐화 추가
// 더 좋게 설계된 클래스
public class Manager02 extends Employee {
	
	Employee[] empList; 	//관리사원목록
	
	Manager02(String name, int salary, String grade, Employee[] empList){
		super(name, salary, grade);  // -->Employee에서 초기화되도록 했음. 이렇게 작성하는 게 좋음!!!
		this.empList = empList;
	}

	// 메소드 오버라이드(Method Override) : 메소드 재정의  ---> 다형성과 관련잆음
	@Override 	// <-- 프로그래밍 주석
	void info() {
		super.info();
		
		System.out.println("--------------------------------------");
		System.out.println("\t\t < 관리사원목록 > ");
		System.out.println("--------------------------------------");
		
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("--------------------------------------");
	}
}
