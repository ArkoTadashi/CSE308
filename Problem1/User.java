package Problem1;

public abstract class User {

    protected ABCServer abcServer;
    public abstract void notify(State prevState, State currState);
}
