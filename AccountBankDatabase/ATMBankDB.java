import java.util.Scanner;

public class ATMBankDB {

    private static Scanner input = new Scanner(System.in);
    private static BankDatabase bankDatabase = new BankDatabase();
    private static boolean CONTINUE = true;
    public void run() {

        System.out.println("~~~ ATMBankDBApp ~~~\n");
        int input = chooseAction();
        CONTINUE = continueOrStop(input);

        while(CONTINUE) {

            switch(input) {
                case 1:
                    checkUserAuthentication();
                    break;
                case 2:
                    checkAvailableBalance();
                    break;
                case 3:
                    checkTotalBalance();
                    break;
                case 4:
                    credit();
                    break;
                case 5:
                    debit();
                    break;
            }

            input = chooseAction();
            CONTINUE = continueOrStop(input);
        }

        System.out.println("~~~ END ~~~\n");
    }
    private void checkAvailableBalance() {

        System.out.print("Enter account number: ");
        int account = input.nextInt();
        System.out.printf("Available balance: USD%,.2f\n",
                bankDatabase.getAvailableBalance(account));
    }
    private void checkTotalBalance() {

        System.out.print("Enter account number: ");
        int account = input.nextInt();
        System.out.printf("Total balance: USD%,.2f\n", bankDatabase.getTotalBalance(account));
    }
    private void credit() {

        System.out.print("Enter account number: ");
        int account = input.nextInt();
        System.out.print("Enter credit amount (in CENTS): ");
        double amount = (double) input.nextInt() / 100;
        bankDatabase.credit(account, amount);

        System.out.println("Credit DONE.");
    }
    private void debit() {

        System.out.print("Enter account number: ");
        int account = input.nextInt();
        System.out.print("Enter debit amount (in CENTS): ");
        double amount = (double) input.nextInt() / 100;
        bankDatabase.debit(account, amount);

        System.out.println("Debit DONE.");
    }
    private boolean continueOrStop(int input) { // -1 to quit
        return input > 0 ? true: false;
    }
    private void checkUserAuthentication()  {

        System.out.print("Enter account number: ");
        int account = input.nextInt();

        System.out.print("Enter pin: ");
        int pin = input.nextInt();

        if(bankDatabase.authenticateUser(account,pin))
            System.out.println("User is in the database.\n");
        else
            System.out.println("User is NOT in the database.\n");
    }
    private int chooseAction() {

        System.out.println(" **Choose action from list**");
        System.out.println("*ENTER (-1) to QUIT*");
        System.out.println("1 - authenticate user: ");
        System.out.println("2 - check available balance: ");
        System.out.println("3 - check total balance: ");
        System.out.println("4 - credit: ");
        System.out.print("5 - debit: ");
        return input.nextInt();
    }
}