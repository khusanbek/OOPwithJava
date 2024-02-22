public class Authentication {

    private boolean userAuthenticated;
    private Keypad keypad;
    private Screen screen;
    private User userList[];
    private boolean CONTINUE;

    public Authentication() {

        userAuthenticated = false;
        CONTINUE = true;
        keypad = new Keypad();
        screen = new Screen();

        userList = new User[] {
                new User("james", "12345"),
                new User("sully","54321"),
                new User("jack", "11111"),
                new User("simon", "22222"),
                new User("helen", "33333"),
                new User("rebecca", "44444"),
                new User("juthy", "55555")
        };
    }

    public void run() {

        while (CONTINUE) {

            while (!userAuthenticated) {
                screen.displayMessageLine("\n *** Welcome to App *** ");
                screen.displayUsers(userList);
                authenticateUser();
            }

            screen.displayMessage("Enter -1 to quit: ");
            if (keypad.getMessage().equals("-1"))
                CONTINUE = false;

            userAuthenticated = false;
        }
    }
    public void authenticateUser() {

        String username;
        String password;

        screen.displayMessage("Please enter username: ");
        username = keypad.getMessage();
        screen.displayMessage("Please Enter password: ");
        password = keypad.getMessage();

        userAuthenticated = authenticateUser(username, password);

        if(userAuthenticated)
            screen.displayMessageLine("Thank you, authentication data is successful.");
        else
            screen.displayMessageLine("Invalid username/password. Please, try again.");
    }

    private boolean authenticateUser(String u, String p) {

        boolean found = false;

        for(User user : userList)
            if(user.authenticate(u, p)) {
                found = true;
                break;
            }

        return found;
    }
}
