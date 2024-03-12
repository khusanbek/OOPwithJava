public class FuelCalculator {
    //initializing objects needed for project
    private boolean userAuthenticated;
    private Screen screen;
    private Keypad keypad;
    private Tank tank;


    //initializing numbers for menu functions 
    private static final int BUY_FUEL = 1;
    private static final int KM_PASSED = 2;
    private static final int REPORT = 3;
    private static final int EXIT = 4;

    //initializing constructor 
    public FuelCalculator() {
        userAuthenticated = false;
        screen = new Screen();
        keypad = new Keypad();
        tank = new Tank(); 
    }

    //initializing run function which displays "Welcome" message with displayMenu function
    public void run() {
        screen.displayMessage("Welcome to Fuel Calculator\n");
        userAuthenticated = true; 
        
        while (userAuthenticated) { 
            displayMainMenu();
        }
    }

    //displays menu 
    private void displayMainMenu() {
        screen.displayMessageLine("\n Main Menu:");
        screen.displayMessageLine("1 - Buy Fuel");
        screen.displayMessageLine("2 - Kilometres Passed");
        screen.displayMessageLine("3 - Generate Report");
        screen.displayMessageLine("4 - Exit");


        //saving user input into option 
        int option = keypad.getInput();
        switch (option) {
            //case 1
            case BUY_FUEL:
                screen.displayMessage("Enter the fuel in liters (less than tank capacity): ");
                int amountFuel = keypad.getInput();
                tank.addFuel(amountFuel);
                break;

            //case 2
            case KM_PASSED:
                screen.displayMessage("Enter km passed: ");
                int kmPassed = keypad.getInput();
                tank.addKm(kmPassed);
                break;

            //case 3
            case REPORT:
                generateReport();
                break;

            //case 4
            case EXIT:
                userAuthenticated = false; 
                screen.displayMessageLine("Exiting Fuel Calculator. Goodbye!");
                break;

            //in case something wrong has been chosen
            default:
                screen.displayMessageLine("Invalid selection. Try again.");
                break;
        }
    }
    //generate report function that generates report for fuel calculator
    private void generateReport() {
        int fuelRemaining = tank.calculateFuelLeft();
        screen.displayMessageLine("Fuel in the tank: " + fuelRemaining + " liters. Visualization: " + tank.createTank(fuelRemaining));
        screen.displayMessageLine("Tank capacity: " + tank.getTank());
        screen.displayMessageLine("Total km passed: " + tank.getTotalKm());
        screen.displayMessageLine("Total Fuel purchased (litres): " + tank.getTotalFuel());
        screen.displayMessageLine("Total Fuel Price (soums): " + tank.getTotalPrice());
        
        int remainingDistance = tank.calculateDistance();
        screen.displayMessageLine("You can drive " + remainingDistance + " more kilometers with the fuel you have in the tank.");
    

    }
}
