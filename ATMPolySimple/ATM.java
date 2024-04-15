//Class Withdrawal represents an ATM withdrawal transaction
import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		
		Transaction polyObj = null;
		
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		
		System.out.println("Polymorphism example:\n");
		
		while(userInput != -1) {

			System.out.print(" -Choose which object to print\n" +
				" 1 - Balance inquiry\n 2-Deposit\n 3-Withdrawal\n -1 to quit: ");
				userInput = input.nextInt();
			
			polyObj = printPolymorphicObject(userInput);
			
			if(userInput != -1)
				polyObj.printInfo();
		}
	}
	
	public static Transaction printPolymorphicObject(int option) {
		
		Transaction transaction = null;
		
		switch (option) {
			case 1:
				transaction = new BalanceInquiry("Balance message");
				break;
			case 2:
				transaction = new Deposit("Deposit message");
				break;
			case 3:
				transaction = new Withdrawal("Withdrawal message");
				break;
		}
		
		return transaction;
	}
} // end class