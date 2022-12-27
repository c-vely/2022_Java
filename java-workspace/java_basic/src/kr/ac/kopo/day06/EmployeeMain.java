package kr.ac.kopo.day06;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
//		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo();
		
			
		Employee e = new Employee("홍길동", "사원", 3_000);
		Employee e2 = new Employee("고길동", "사원", 3_200);
		Employee e3 = new Employee("윤길동", "대리", 3_500);		
		
		e.info();
		e2.info();
		e3.info();
		
//      e3.employeeCntInfo();		
//		System.out.println("총 사원수 : " + e.employeeCnt + "명"); // --> 인스턴스로 접근할 수 있으나, 클래스명으로 접근하는 것이 바름
//		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");  // --> 그런데 이것도 유지보수 면에서 좋지 못하다. 메소드를 이용하는 걸로 바뀌는게 좋음
		
		Employee.employeeCntInfo();
				
		
	}

}
