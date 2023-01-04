package Problem3;

public class RefillingState extends State {


    public RefillingState(VendingMachine vm) {
        this.vm = vm;
    }
    public void changeState() {

    }
    public void collect(int amount) {

    }
    public void refill() {
        vm.refill();
    }

    public void returnChange() {
        
    }

    public void run() {

    }
}