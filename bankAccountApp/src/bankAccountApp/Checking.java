package bankAccountApp;

public class Checking extends Account {
	
	//list the properties specific to a checking account
	int debitCardNumber;
	int debitCardPin;
	
	//constructor to initialize checking  account properties
	
	public Checking(String name, String socialSecNumber, double initDeposit) {
		super(name, socialSecNumber, initDeposit);
		accountNumber = "2" + accountNumber;
		System.out.println("ACCOUNT NUMBER " + this.accountNumber);
		System.out.println("NEW CHECKING ACCOUNT");
	
	}
	
	
	//list methods specific to the checking account

}
