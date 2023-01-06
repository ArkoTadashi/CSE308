package Problem3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RefillingState extends State {

    BufferedReader br;
    String read;

    public RefillingState(VendingMachine vm) {
        br = new BufferedReader(new InputStreamReader(System.in));
        this.vm = vm;
    }
    public void changeState() {
        vm.setState(new IdleState(vm));
    }
    public void collect(int amount) {

    }
    public void refill() {
        vm.refill();
    }

    public void returnChange() {
        
    }

    public void run() {
        
        System.out.println("We are stock out at this moment");
        System.out.println("Refill the machine?");

        try {
            read = br.readLine();
            if (read.equalsIgnoreCase("YES")) {
                refill();
                changeState();
            }
        } catch (IOException e) {
            // BRUV
        }
        
    }
}