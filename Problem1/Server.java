package Problem1;

import java.util.List;

public abstract class Server {
    protected List<User> userList;
    protected List<User> premiumUserList;

    public void addUser(User user) {
        userList.add(user);
    }
    public void removeUser(User user) {
        userList.remove(user);
    }

    public void addPremiumUser(User user) {
        removeUser(user);
        premiumUserList.add(user);
    }

    public void removePremiumUser(User user) {
        premiumUserList.remove(user);
        addUser(user);
    }

    abstract public void notifyUsers();
}
