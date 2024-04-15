// Deposit.java
// Represents a deposit ATM transaction

public class Deposit extends Transaction {
	
	public Deposit (String theMessage) {
		super(theMessage);
	}// end constructor
	
	//performs the transaction
	@Override
	public void printInfo() {
		
		System.out.println(" *** Deposit: " + getMessage() + " ***\n");
	}
}
