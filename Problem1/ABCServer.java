package Problem1;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class ABCServer{
    private State prevState;
    private State currState;
    private List<User> userList;

    public ABCServer() {
        userList = new ArrayList<>();
        prevState = null;
        currState = State.OPERATIONAL;
    }

    public void addUser(User user) {
        userList.add(user);
    }
    public void removeUser(User user) {
        userList.remove(user);
    }

    public State getPrevState() {
        return prevState;
    }
    public State getCurrState() {
        return currState;
    }

    public void setState(State currState) throws IOException {
        this.prevState = this.currState;
        this.currState = currState;
        notifyUsers();
    }


    
    public void notifyUsers() throws IOException {
        for (User user: userList) {
            user.notifyUser();
        }
    }
}

