// Transaction.java
// Abstract super class Transaction represents an ATM transaction

public abstract class Transaction {
	
	private String message;
	
	// transaction constructor invoked by subclasses by using super()
	public Transaction(String theMessage) {
		message = theMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String theMessage) {
		message = theMessage;
	}
	
	abstract public void printInfo();
}
