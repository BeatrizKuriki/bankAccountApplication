package bankAccountApp;

public abstract class Account implements IBaseRate {
	
	//list common properties  for savings and checking account
	String name;
	String socialSecNumber;
	double balance;	
	double rate;
	String accountNumber;
	
	
	
	
	
	//constructor  to set base properties and initialize the account
	public Account(String name) {
		System.out.println("NAME: " + name);
		System.out.print("NEW ACCOUNT: ");
	}
	
	
	//list common methods

}
