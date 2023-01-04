package Problem3;

public abstract class State {

    protected VendingMachine vm;

    public abstract void changeState();
    public abstract void collect(int amount);
    public abstract void refill();
    public abstract void returnChange();


    public abstract void run();
}