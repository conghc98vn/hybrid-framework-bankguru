package dataConfig;

public class AccountInfo {
    private String usernameID;
    private String password;

    public static AccountInfo getAccountInfo() {
        return new AccountInfo();
    }

    public String getUsernameID() {
        return usernameID;
    }
    public void setUsernameID(String usernameID) {
        this.usernameID = usernameID;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
