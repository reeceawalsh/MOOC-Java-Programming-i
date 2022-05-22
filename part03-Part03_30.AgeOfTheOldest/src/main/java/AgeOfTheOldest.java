
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int highestAge = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Age of the oldest: " + highestAge);
                break;
            } else {
            String[] split = input.split(",");
            if (highestAge < Integer.valueOf(split[1])) {
                highestAge = Integer.valueOf(split[1]);
            }
        }
        }
    }
}
