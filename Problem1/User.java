package Problem1;

import java.io.IOException;

public abstract class User {

    protected ABCServer abcServer;

    protected boolean premium;
    protected boolean bothServer;

    protected State prevState;
    protected State currState;

    public User(ABCServer abcServer) {
        this.abcServer = abcServer;
    }

    public abstract void notifyUser() throws IOException;
}
