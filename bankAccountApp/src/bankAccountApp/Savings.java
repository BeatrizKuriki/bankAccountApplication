package bankAccountApp;

public class Savings extends Account {
	
	//list properties specific to the saving account
	int safetyDepositBoxID;
	int safetyDepositBosKey;
	
	//constructor to initialize  settings for the savings properties
	public Savings(String name, String socialSecNumber, double initDeposit) {
		super(name, socialSecNumber,initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("ACCOUNT NUMBER " + this.accountNumber);
		System.out.println("NEW SAVINGS ACCOUNT");
		
	}
	
	
	//list methods specific to savings account

}
