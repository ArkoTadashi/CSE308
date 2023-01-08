package Problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegularUser extends User {

    private BufferedReader br;

    public RegularUser(ABCServer abcServer) {
        this.abcServer = abcServer;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void notify(State prevState, State currState) {
        if (prevState == State.OPERATIONAL && currState == State.PARTIALLY_DOWN) {
            System.out.println("Using limited functionality");
            System.out.println("Pay 20$ to use premium service? Type Yes or No.");
            try {
                String read = br.readLine();
                if (read.equalsIgnoreCase("YES")) {

                }
            } catch (IOException e) {

            }

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
