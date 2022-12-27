package kr.ac.kopo.day06.parctice;

public class CoffeeMain {
	
	public static void main(String[] args) {
		
		
		Cafe merry = new Cafe();
		
		Guest man = new Guest(10000, true);
		
		merry.open(man);
		
//		man.order();
		
		
		man.pay();
		
		merry.bye(man.setTotalMoney());
		
		
	}

}
