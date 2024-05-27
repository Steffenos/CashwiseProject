

public class Login {
    public boolean login(String username, String password) {
        // Implement your login logic here
        // Return true if login is successful, otherwise return false
        if ("correctUsername".equals(username) && "correctPassword".equals(password)) {
            return true;
        }
        return false;
    }
}
