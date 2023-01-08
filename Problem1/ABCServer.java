package Problem1;

import java.util.ArrayList;

public class ABCServer extends Server{
    private State prevState;
    private State currState;

    public ABCServer() {
        userList = new ArrayList<>();
        premiumUserList = new ArrayList<>();
        prevState = State.OPERATIONAL;
        currState = State.OPERATIONAL;
    }

    @Override
    public void notifyUsers() {

    }
}

