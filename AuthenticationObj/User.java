public class User {

    private String userName;
    private String password;

    public User() {
        userName = "";
        password = "";
    }

    public User(String un, String pw) {
        userName = un;
        password = pw;
    }

    public boolean authenticate(String un, String pw) {

        if(un.equals(getUserName()) && pw.equals(getPassword()))
            return true;
        else
            return false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String un) {
        userName = un;
    }

    public String getPassword() {
        return password;
    }

    public String getHidedPassword() {
        return getPassword().replaceAll(".", "*");
    }

    public void setPassword(String pw) {
        password = pw;
    }

    @Override
    public String toString() {

        return String.format("(%s %s)", getUserName(), getHidedPassword());
    }
}
