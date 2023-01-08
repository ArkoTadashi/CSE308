package Problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PremiumUser extends User {

    private BufferedReader br;

    public PremiumUser(ABCServer abcServer) {
        this.abcServer = abcServer;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void notify(State prevState, State currState) {
        if (prevState == State.OPERATIONAL && currState == State.PARTIALLY_DOWN) {

        }
        else if (prevState == State.OPERATIONAL && currState == State.FULLY_DOWN) {

        }
        else if (prevState == State.PARTIALLY_DOWN && currState == State.OPERATIONAL) {

        }
        else if (prevState == State.PARTIALLY_DOWN && currState == State.FULLY_DOWN) {

        }
        else if (prevState == State.FULLY_DOWN && currState == State.OPERATIONAL) {

        }
        else if (prevState == State.FULLY_DOWN && currState == State.PARTIALLY_DOWN) {

        }
    }
}
