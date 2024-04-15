//Class Withdrawal represents an ATM withdrawal transaction

public class Withdrawal extends Transaction {
	
	public Withdrawal (String theMessage) {
		super(theMessage);
	}// end constructor
	
	//performs the transaction
	@Override
	public void printInfo() {
		
		System.out.println(" *** Withdrawal: " + getMessage() + " ***\n");
	}
} // end class