public class Authentication {

    private boolean userAuthenticated;
    private Keypad keypad;
    private Screen screen;
    private String usernameList[];
    private String passwordList[];
    private boolean CONTINUE;


    public Authentication() {

        userAuthenticated = false;
        CONTINUE = true;
        keypad = new Keypad();
        screen = new Screen();

        usernameList = new String[] {"james", "sully", "jack",
                "simon", "helen", "rebecca", "juthy"};

        passwordList = new String[] {"12345", "54321", "11111",
                "22222", "33333", "44444", "55555"};
    }

    public void run() {

        while(CONTINUE) {

            while (!userAuthenticated) {
                screen.displayMessageLine("\n *** Welcome to App *** ");
                authenticateUser();
            }

            screen.displayMessage("Enter -1 to quit: ");
            if(keypad.getMessage().equals("-1"))
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

        boolean uFound = false;
        boolean pFound = false;
        int uIndex = -1;
        int pIndex = -1;

        for(int i = 0; i < usernameList.length; i++)
            if(u.equals(usernameList[i])) {
                uFound = true;
                uIndex = i;
                    break;
            }

        for(int i = 0; i < passwordList.length; i++)
            if(p.equals(passwordList[i])) {
                pFound = true;
                pIndex = i;
                    break;
            }

        if(pIndex != uIndex)
            return false;
        else
            return uFound && pFound;
    }
}
