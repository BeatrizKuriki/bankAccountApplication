package bankAccountApp;

public class Checking extends Account {
	
	//list the properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor to initialize checking  account properties
	
	public Checking(String name, String socialSecNumber, double initDeposit) {
		super(name, socialSecNumber, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();	
	
	}
	@Override
	public void setRate() {
		rate = getIBaseRate()* 0.15;
	
	
	}
	
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
		
	}
	
	//list methods specific to the checking account
	
	public void showInfo() {
		super.showInfo();
		System.out.println("");
		
		System.out.println("Your Checking Account Features:  " +
							"\n Debit Card Number: " +debitCardNumber+
							"\n Debit Card PIN " + debitCardPin
							);
	}

}
