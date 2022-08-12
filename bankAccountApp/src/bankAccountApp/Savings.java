package bankAccountApp;

public class Savings extends Account {
	
	//list properties specific to the saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//constructor to initialize  settings for the savings properties
	public Savings(String name, String socialSecNumber, double initDeposit) {
		super(name, socialSecNumber,initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
		
	
			
		}
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)( Math.random() * Math.pow(10,3));
		
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
		
		
	}
	
	
	//list methods specific to savings account
	
	public void showInfo() {
		
		super.showInfo();
		System.out.println(
				"Your Savings Account Features: " +
			     "\n Safety Deposit Box ID " + safetyDepositBoxID+
			     "\n Safety Deposit Box Key " + safetyDepositBoxKey
		
				);
	
	}

}
