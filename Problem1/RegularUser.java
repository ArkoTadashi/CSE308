package Problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegularUser extends User {

    private BufferedReader br;

    public RegularUser(ABCServer abcServer) {
        super(abcServer);
        premium = false;
        bothServer = true;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void notifyUser() throws IOException {

        prevState = abcServer.getPrevState();
        currState = abcServer.getCurrState();

        System.out.println("\n\t REGULAR USER ");

        if (currState == State.OPERATIONAL) {
            if (premium) {
                System.out.println("You total due payment for using our premium services is $x");
            }
        }
        else if (prevState == State.OPERATIONAL && currState == State.PARTIALLY_DOWN) {
            System.out.println("Our server is updating \nIt is currently partially down");
            System.out.println("Using limited functionality");
            System.out.println("Pay $20 per hour to use premium service? \nType Yes or No");
            
            String read = br.readLine();

            if (read.equalsIgnoreCase("YES")) {
                premium = true;
                System.out.println("Thank you for subscribing to our premium services");
                System.out.println("All of your data are copied to the backup server");
            }
            else {
                System.out.println("You can always subscribe to our premium services to access your data at all times");
            }

        }
        else if (prevState == State.OPERATIONAL && currState == State.FULLY_DOWN) {
            System.out.println("Our server is updating and currently down");
            System.out.println("Pay $20 per hour to use premium service? \nType Yes or No");
            
            String read = br.readLine();

            if (read.equalsIgnoreCase("YES")) {
                premium = true;
                System.out.println("Thank you for subscribing to our premium services");
                System.out.println("All of your data are copied to the backup server");
                System.out.println("You can keep using the services");
            }
            else {
                System.out.println("You can always subscribe to our premium services to access your data at all times");
            }
        }

        System.out.println("\n\t __REGULAR USER__ ");
    }

}
