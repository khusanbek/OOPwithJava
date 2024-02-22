//Screen.java
// Represents the screen of the ATM

public class Screen {
    public void displayMessage(String message) {
        System.out.print(message);
    }

    public void displayMessageLine(String message) {
        System.out.println(message);
    }

    public void displayUsers(User userList[]) {

        for(User user : userList)
            System.out.println(user);
    }
}// end class screen