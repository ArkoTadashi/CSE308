package Problem3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IdleState extends State {


    public IdleState(VendingMachine vm) {
        this.vm = vm;
    }

    public void changeState() {
        if (vm.getCapacity() == vm.getSoldCount()) {
            vm.setState(new RefillingState(vm));
        }
        else {
            vm.setState(new BuyingState(vm));
        }
    }
    public void collect(int amount) {

    }

    public void refill() {

    }

    public void returnChange() {

    }

    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read;

        System.out.println("Would you like to buy our product?");

        try {
            read = br.readLine();
            if (read.equalsIgnoreCase("YES")) {
                changeState();
            }
        } catch (IOException e) {
            // BRUV
        }
        

    }
}