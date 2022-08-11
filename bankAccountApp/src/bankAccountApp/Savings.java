package bankAccountApp;

public class Savings extends Account {
	
	//list properties specific to the saving account
	int safetyDepositBoxID;
	int safetyDepositBosKey;
	
	//constructor to initialize  settings for the savings properties
	public Savings(String name, String socialSecNumber, double initDeposit) {
		super(name, socialSecNumber,initDeposit);
		accountNumber = "1" + accountNumber;
		
		
	}
	
	
	//list methods specific to savings account
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings");
	}

}
