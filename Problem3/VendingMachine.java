package Problem3;

import java.util.Random;

public class VendingMachine {

    private State state;
    private int capacity;
    private int price;
    private int soldCount;

    public VendingMachine() {
        this.state = new IdleState(this);
        Random random = new Random();
        capacity = random.nextInt(10);
        price = random.nextInt(50);
        soldCount = 0;
    }

    public void setState(State state) {
        this.state = state;
        state.run();
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void sold() {
        soldCount++;
    }
    
    public void refill() {
        soldCount = 0;
    }

    public void run() {
        state.run();
    }

}