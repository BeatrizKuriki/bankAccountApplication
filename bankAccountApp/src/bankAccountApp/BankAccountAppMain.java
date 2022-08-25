package bankAccountApp;

import java.io.File;
import java.util.List;

public class BankAccountAppMain {

	public static void main(String[] args) {

		String file = ;
	
		/*	
		Checking chkacc1 = new Checking("BEL SANDERS ", "53363945110", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "01004021985", 2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		System.out.println("*************************");
		chkacc1.showInfo();
		*/
		
		
		
		//read a csv file then create new accounts based on that data
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
			
			
		}

	}

}
