package Problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ABCServer abcServer = new ABCServer();
        RegularUser regularUser = new RegularUser(abcServer);
        PremiumUser premiumUser = new PremiumUser(abcServer);
        abcServer.addUser(regularUser);
        abcServer.addUser(premiumUser);

        while (true) {
            System.out.println("The server is currently " + abcServer.getCurrState());

            System.out.println("Change the server state\nType 1/2/3 to change");
            System.out.println("1. OPERATIONAL\n2. PARTIALLY DOWN\n3. FULLY DOWN");

            String read = br.readLine();
            int option = Integer.parseInt(read);

            if (option == 1) {
                if (abcServer.getCurrState() == State.OPERATIONAL) {
                    System.out.println("The server is already in OPERATIONAL state");
                }
                else {
                    abcServer.setState(State.OPERATIONAL);
                }
            }
            if (option == 2) {
                if (abcServer.getCurrState() == State.PARTIALLY_DOWN) {
                    System.out.println("The server is already in PARTIALLY DOWN state");
                }
                else {
                    abcServer.setState(State.PARTIALLY_DOWN);
                }
            }
            if (option == 3) {
                if (abcServer.getCurrState() == State.FULLY_DOWN) {
                    System.out.println("The server is already in FULLY DOWN state");
                }
                else {
                    abcServer.setState(State.FULLY_DOWN);
                }
            }
        }

    }
}
