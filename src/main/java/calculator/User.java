package calculator;

public class User {

    private String userName = "";
    private String password = "";

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {

        this.userName = userName+1;

    }
    public String getUserName() {
        return userName;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
