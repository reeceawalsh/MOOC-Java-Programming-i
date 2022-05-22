
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        String name = "anything";
        int oldest = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Name of the oldest: " + name);
                break;
            } else {
                String[] split = input.split(",");
                if (oldest < Integer.valueOf(split[1])) {
                    oldest = Integer.valueOf(split[1]);
                    name = String.valueOf(split[0]);
                }
            }
        }

    }
}
