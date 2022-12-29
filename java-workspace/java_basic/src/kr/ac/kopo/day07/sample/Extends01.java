package kr.ac.kopo.day07.sample;


class Person{
	String personName;
	String address;
	
	Person(String personName,String address){
	this.personName = personName;
	this.address = address;
	}
	
	void showPersonalDetails(){
		System.out.println("Name is: "+personName);
		}
}


class Employee extends Person{
	String employeeID;
	double salary;
	
	Employee(String personName,String address,String employeeID,double salary){
		super(personName,address);
		this.employeeID = employeeID;
		this.salary = salary;
	}
}


class Manager extends Employee{
	int numberOfSubordinates;
	
	Manager(String personName,String address,String employeeID,double salary,int numberOfSubordinates){
		super(personName,address,employeeID,salary);
		this.numberOfSubordinates = numberOfSubordinates;
	}
}


class MultileveleInheritance{
	public static void main(String args[]){
		
//	Person p =  new Person();
//	Employee e = new Employee();
//	Manager m = new Manager();
	
	
	}
}



public class Extends01 {

}
