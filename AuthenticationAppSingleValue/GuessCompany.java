public class GuessCompany {
    private boolean guessRight;
    private Keypad keypad;
    private Screen screen;
    public GuessCompany(){

        guessRight = false;
        keypad = new Keypad();
        screen = new Screen();
    }

    public void run(){

        while (!guessRight) {
            screen.displayMessage("\nWelcome: ");
            checkUserGuess();
        }
        screen.displayMessage("\nYou guessed right, good bye!");
    }
    public void checkUserGuess() {
        screen.displayMessage("\nWhich company makes iphones?: ");

        String input = keypad.getMessage();
        if(input.equals("apple")) {
            guessRight = true;
        }
    }

}
