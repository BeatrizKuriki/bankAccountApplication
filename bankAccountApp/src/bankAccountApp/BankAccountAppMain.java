package bankAccountApp;

public class BankAccountAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checking chkacc1 = new Checking("BEL SANDERS ", "53363945110", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "01004021985", 2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		System.out.println("*************************");
		chkacc1.showInfo();
		
		
		
		
		//read a csv file then create new accounts based on that data

	}

}
