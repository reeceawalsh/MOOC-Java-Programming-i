
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int count = 0;
        double sumOfAges = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Longest name: " + longestName);
                System.out.println("Average of the birth years: " + (sumOfAges / count));
                break;
            } else {
                String[] inputArray = input.split(",");
                count ++;
                sumOfAges += Integer.valueOf(inputArray[1]);
                if (inputArray[0].length() > longestName.length()) {
                    longestName = inputArray[0];
                    }
                }
            }
        }
    }
