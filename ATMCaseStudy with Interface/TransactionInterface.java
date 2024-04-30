// Transaction.java
// Abstract super class Transaction represents an ATM transaction

public abstract interface TransactionInterface {
	
	// transaction constructor invoked by subclasses by using super()	
	abstract public void execute();
}
