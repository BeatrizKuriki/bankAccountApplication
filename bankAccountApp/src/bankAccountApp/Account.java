package bankAccountApp;

public abstract class Account implements IBaseRate {
	
	//list common properties  for savings and checking account
	String name;
	String socialSecNumber;
	double balance;	
	double rate;
	String accountNumber;
	
	
	
	
	
	//constructor  to set base properties and initialize the account
	public Account(String name, String socialSecNumber, double initDeposit) {
		this.name = name;
		this.socialSecNumber = socialSecNumber;
		balance = initDeposit;
		System.out.println("NAME: "+ name + " SSN: " + socialSecNumber +" BALANCE $: " + balance);
	
	}
	
	
	//list common methods

}
