package Problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyingState extends State{
    private int remaining;
    BufferedReader br;
    String read;

    public BuyingState(VendingMachine vm) {
        this.vm = vm;
        remaining = vm.getPrice();
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void changeState() {

    }
    public void collect(int amount) {
        remaining -= amount;
        if (remaining > 0) {
            System.out.println("You still need to pay " + remaining + " more to get the item");
        }
        else {
            vm.setState(new ItemState(vm, -remaining));
        }
    }
    public void refill() {

    }

    public void returnChange() {
        
    }

    public void run() {
        System.out.println("The price of the product is " + vm.getPrice());
        System.out.println("Please pay to get the item");
        System.out.print("Your provided amount: ");
        
        while (remaining > 0) {
            try {
                read = br.readLine();
            } catch (IOException e) {
                // BRUV
            }
            
            int amount = Integer.parseInt(read);
            collect(amount);
        }
    }
}