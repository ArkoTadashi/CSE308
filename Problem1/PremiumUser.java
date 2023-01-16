package Problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PremiumUser extends User {

    private BufferedReader br;

    public PremiumUser(ABCServer abcServer) {
        super(abcServer);
        premium = true;
        bothServer = false;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void notifyUser() throws IOException{
        prevState = abcServer.getPrevState();
        currState = abcServer.getCurrState();
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
