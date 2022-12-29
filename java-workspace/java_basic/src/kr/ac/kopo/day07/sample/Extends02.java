package kr.ac.kopo.day07.sample;


//parent class A 
class A { 
	public void print_a() { 
		System.out.println("A"); 
		} 
	} 

//Derived class B - intermediary 
class B extends A { 
	public void print_b() { 
		System.out.println("B"); 
		} 
	} 

//Derived Class C 

class C extends B { 
	public void print_c() { 
		System.out.println("C"); 
		} 
	} 

public class Extends02 { 
	
	public static void main(String[] args) { 
		C c = new C(); 
		c.print_c();
		c.print_b();
		c.print_a();
		
		
		
		//create Class C obj c_obj.print_A(); 
		//call grandparent class method c_obj.print_B(); 
		//call parent class method c_obj.print_C(); 
		//call member method } }
	}
}

