package bankAccountApp;

public abstract class Account implements IBaseRate {
	
	//list common properties  for savings and checking account
	String name;
	String socialSecNumber;
	double balance;	
	double rate;
	String accountNumber;
	static int index = 10000;
	
	
	
	
	//constructor  to set base properties and initialize the account
	public Account(String name, String socialSecNumber, double initDeposit) {
		this.name = name;
		
		this.socialSecNumber = socialSecNumber;
		balance = initDeposit;
		System.out.println("NAME: "+ name + " SSN: " + socialSecNumber +" BALANCE $: " + balance);
		
		
		index++;
		this.accountNumber= setAccountNumber();
		System.out.println("ACCOUNT NUMBER " + this.accountNumber);
		
	
	}
	
	private String setAccountNumber() {
		String lastTwoOfsocialSecNumber = socialSecNumber.substring(socialSecNumber.length()-2, socialSecNumber.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfsocialSecNumber + uniqueID + randomNumber;
	}
	
	
	//list common methods

}
