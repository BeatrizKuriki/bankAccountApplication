package bankAccountApp;

public abstract class Account implements IBaseRate {
	
	//list common properties  for savings and checking account
	private String name;
	private String socialSecNumber;
	private double balance;	
	protected double rate;
	protected String accountNumber;
	private static int index = 10000;
	
	
	
	
	//constructor  to set base properties and initialize the account
	public Account(String name, String socialSecNumber, double initDeposit) {
		this.name = name;
		
		this.socialSecNumber = socialSecNumber;
		balance = initDeposit;
		
		
		
		index++;
		this.accountNumber= setAccountNumber();	
		
		setRate();
		
	
	}
	
	public abstract void setRate();
	
	
	private String setAccountNumber() {
		String lastTwoOfsocialSecNumber = socialSecNumber.substring(socialSecNumber.length()-2, socialSecNumber.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfsocialSecNumber + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $ "+accruedInterest);
		printBalance();
	}
	
	//list common methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $ " +amount );
		printBalance();
		
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing  $ " +amount );
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $ " +amount + " to "+toWhere);
		printBalance();
		
	}
	public void printBalance() {
		
		System.out.println("Your Balance is now:  $" + balance);
	}
	public void showInfo() {
		System.out.println(
				"NAME :" + name +
				"\nACCOUNT NUMBER: "+ accountNumber +
				"\nBALANCE: $ " + balance +
				"\n RATE: " +rate + "%"
				);
	}

}
