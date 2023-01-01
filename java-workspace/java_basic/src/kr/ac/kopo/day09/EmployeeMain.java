package kc.ac.kopo.day09;

public class EmployeeMain {
	
	public static void main(String[] args) {
				
		Employee e = new Employee(1, "홍길동", 4_000, "대리");
		
		
		// Employee 멤버변수가 private으로 설정되어 있어 직접호출이 안됨. 그래서 getter 메소드를 사용해 값을 읽는다.
//		System.out.println("사원명 : " + e.name);  ----> 오류
		System.out.println("사원명 : " + e.getName());
		System.out.println("연봉 : " + e.getSalary());
		System.out.println("직급 : " + e.getGrade());
		
		
		// 외부에서 내 객체가 가지고 있는 값을 수정하기 위한 용도로 사용하는 setter 메소드를 사용해야 한다. 
//		e.grade = "과장";  ----> 오류
		e.setGrade("과장");
		System.out.println("승진 후 직급 : " + e.getGrade());
		
		e.setSalary(e.getSalary() + 500); // ---> 추가하는 코드는 따로 만드는 것이 아니라, 객체를 만든 클래스 내에서 이런식으로 추가하는 것이 좋음
		System.out.println("승진 후 연봉 : " + e.getSalary() + "만원");
			
		
		
		// Object 클래스가 가지고 있는 메소드 (모든 클래스는 Object 클래스 상속받는다. 단, 접근제한자가 public or protected일 때 가능. 그래서 내 구미에 맞춰 오버라이딩도 가능하다.) 
		System.out.println(e);  // --> 객체 주소 출력. 실제 내부적으로 e.toString()메소드가 호출되는 것임
		System.out.println(e.toString());  // --> e를 호출하는 것과 똑같이 출력됨 확인		
		
		e.info(); //---> 꼭 필요하지 않으면, 요렇게 정의해서 호출하지 않고,
		System.out.println(e);  // --> Object클래스의 toString메소드를 재정의해서 정보를 보는 방식으로 오버라이딩하여 사용한다.
		
		
		
		
	}

}
