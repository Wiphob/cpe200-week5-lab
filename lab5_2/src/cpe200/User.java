package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;
    private String userPattern = "^[A-Za-z][A-Za-z0-9]{7,}$";
    private String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public String setUserName(String userName) {

        if (userName.matches(userPattern)) {
            String TempEiEi = this.userName;
            this.userName =userName;
            return TempEiEi;
        }
        throw new RuntimeException("invalid name is assigned.");
    }

    public String getPassword() {

        return password;
    }

    public int setPassword(String password) {
        if (password.matches(passPattern)) {
            this.password = password;
            return password.length();
        }
        throw new RuntimeException("invalid password is assigned.");
    }
}

