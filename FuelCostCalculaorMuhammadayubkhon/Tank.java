public class Tank {
    private int capacity;
    private int fuelBought;
    private int currentFuel;
    private int kmEntered;
    private int cost; 
    private Screen screen;
    private int fuelConsuption;
    

    public Tank() {
        //initializing objects needed for the project
        this.capacity = 45;
        this.fuelBought = 0;
        this.currentFuel = 5; 
        this.kmEntered = 0;
        this.cost = 11500; 
        this.fuelConsuption = 10;
        screen = new Screen();
    }
    //setter for the screen object needed to display messages
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    //getter for the total kilometres
    public int getTotalKm() {
        return kmEntered;
    }
    public int getTank(){
        return capacity;
    }

    //getter for the total fuel
    public int getTotalFuel() {
        return fuelBought;
    }

    //getter for the total price
    public int getTotalPrice() {
        return fuelBought * cost;
    }

    //getter for the fuel left
    public int getFuelLeft() {
        return currentFuel;
    }


    //add fuel function that adds the bought amount of fuel to the capacity, where it ahs to be smaller that the capacity itself
    public void addFuel(int amount) {
        if (amount <= 0 || amount + currentFuel > capacity) {
            screen.displayMessage(amount <= 0 ? "Invalid fuel amount." : "Your tank is full!");
            return;
        }

        currentFuel += amount;
        fuelBought += amount;
        screen.displayMessage(amount + " liters added successfully.");
    }

    //add kilometres function that adds the entered kilometres to the total value
    public void addKm(int km) {
        if (km < 0) {
            screen.displayMessage("Invalid kilometer entry.");
            return;
        }
        kmEntered += km;
    }

    //the function that displays the visualization for the fuel left in the tank
    public String createTank(int fuelRemaining) {
        StringBuilder line = new StringBuilder("-");
        int filledSections = fuelRemaining / 5;

        for (int i = 0; i < filledSections; i++) {
            line.append("[]");
        }
        for (int i = filledSections; i < capacity / 5; i++) {
            line.append("--");
        }

        return line.toString();
    }

    public int calculateDistance(){
        
        int fuelEfficency =  currentFuel * fuelConsuption; 
        int remainingDistance =  fuelEfficency - kmEntered;
        return remainingDistance;

    }

    public int calculateFuelLeft(){
        int fuelEfficency = kmEntered / fuelConsuption;
        int fuelRemaining = currentFuel - fuelEfficency;
        return fuelRemaining;
        
    }
    
}
