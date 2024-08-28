import java.util.ArrayList;

public class Bank {

    private ArrayList<User> users;
    private User currentUser;

    public Bank() {
        this.users = new ArrayList<>();
        this.currentUser = null;
        // add some initial test users
        users.add(new User("Sanskar@123", "7388", "Sanskar", "Kesharwani", 3000.0));
        users.add(new User("Keshari@321", "7307", "Sanskar", "Keshari", 2000.0));
    }

    public boolean authenticateUser(String userID, String userPIN) {
        for (User user : users) {
            if (user.getUserID().equals(userID) && user.authenticate(userPIN)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public User getUserByID(String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }
}