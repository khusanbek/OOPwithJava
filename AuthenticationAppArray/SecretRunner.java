public class SecretRunner {
    private boolean userAuthenticated;
    private Screen screen;
    private Keypad keypad;

    private String usernameList[];
    public SecretRunner(){
        userAuthenticated = false;
        screen = new Screen();
        keypad = new Keypad();

        usernameList = new String[] {"james", "sully", "jack",
                "simon", "helen", "rebecca", "juthy"};
    }

    public void run(){

        while(!userAuthenticated) {

            screen.displayMessage("\nWelcome: ");
            checkUsername();
        }
    }

    public void checkUsername() {

        screen.displayMessage("\nPlease, enter the correct username: ");
        String input = keypad.getMessage();

        for (int i = 0; i < usernameList.length; i++) {
            if (input.equals(usernameList[i])) {
                userAuthenticated = true;
                break;
            }
        }
    }
}
