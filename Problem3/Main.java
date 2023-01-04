package Problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        VendingMachine vm = new VendingMachine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Would you like to buy the product?");
        String read = br.readLine();

        while (read.equalsIgnoreCase("YES")) {
            vm.run();
            System.out.println("Do you want to buy another one?");
        }
    }
}