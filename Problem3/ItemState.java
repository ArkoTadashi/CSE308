package Problem3;

public class ItemState extends State {

    private int returnAmount;

    public ItemState(VendingMachine vm, int returnAmount) {
        this.vm = vm;
        this.returnAmount = returnAmount;
    }

    public void changeState() {
        vm.setState(new IdleState(vm));
    }
    public void collect(int amount) {

    }
    public void refill() {

    }

    public void returnChange() {
        System.out.println("Here is your " + returnAmount + " change");
    }

    public void run() {
        System.out.println("Here is your item");
        vm.sold();
        System.out.println("Thank you for buying it from us!");
        changeState();
    }
}