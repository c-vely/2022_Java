package kr.ac.kopo.day06.parctice;

public class Coffee {
	
	String name;
	int price;
	
	Coffee(){}
	
	Coffee(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
	String getName() {
		return this.name;
	}
	
	int getPrice() {
		return this.price;
	}

}
