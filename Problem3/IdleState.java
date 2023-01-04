package Problem3;

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
        changeState();
    }
}