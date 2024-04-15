// BalanceInquiry.java
//Represents a balance inquiry atm transaction

public class BalanceInquiry extends Transaction {
	// balance inquiry constructor
	public BalanceInquiry (String theMessage) {
		super(theMessage);
	}// end constructor
	
	//performs the transaction
	@Override
	public void printInfo() {
		
		System.out.println(" *** Balance inquiry: " + getMessage() + " ***\n");
	}
} // end class
