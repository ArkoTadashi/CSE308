package Problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PremiumUser extends User {

    private boolean premium;
    private boolean bothServer;
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


        System.out.println("\n\t PREMIUM USER");

        if (currState == State.OPERATIONAL) {
            bothServer = false;
        }
        else if (prevState == State.OPERATIONAL && currState == State.PARTIALLY_DOWN) {
            System.out.println("Our server is updating \nIt is currently partially down");
            System.out.println("Currently using services from both of the main and the backup servers");
            bothServer = true;
            System.out.println("Use all services from the backup server? \nType Yes or No");
            
            String read = br.readLine();

            if (read.equalsIgnoreCase("YES")) {
                bothServer = false;
                System.out.println("You are using all the services from the backup server");
            }
        }
        else if (prevState == State.OPERATIONAL && currState == State.FULLY_DOWN) {
            System.out.println("Our server is updating and currently down");
            System.out.println("You are using all the services from the backup server");
        }
        else if (prevState == State.PARTIALLY_DOWN && currState == State.FULLY_DOWN) {
            if (bothServer) {
                System.out.println("Our server is updating and currently down");
                System.out.println("Your services from the main server are transferred to the backup server");
                System.out.println("You are using all the services from the backup server");
                bothServer = false;
            }
        }

        System.out.println("\n\t __PREMIUM USER__");
    }
}
