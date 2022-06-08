
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (amount < 0) {
                    amount = 0;
                }
                else if (command.equals("add")) {
                        firstContainer += amount;
                        if (firstContainer >= 100) {
                            firstContainer = 100;
                        }
                    } else if (command.equals("move")){
                        if (amount > firstContainer) {
                            secondContainer += firstContainer;
                            firstContainer = 0;
                            if (secondContainer >= 100) {
                                secondContainer = 100;
                            }
                        } else {
                            secondContainer += amount;
                            firstContainer -= amount;
                            if (secondContainer >= 100) {
                                secondContainer = 100;
                            }
                        }
                    } else if (command.equals("remove")) {
                        if (amount > secondContainer) {
                            secondContainer = 0;
                        } else {
                            secondContainer -= amount;
                        }
                    }

            }

        }
    }

}
