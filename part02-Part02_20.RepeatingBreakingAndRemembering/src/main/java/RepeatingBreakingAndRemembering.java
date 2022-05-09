
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;
        int odds = 0;
        int evens = 0;

        while (true) {

            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum:" + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even: " + evens);
                System.out.println("Odd: " + odds);
                break;
            } else {
                sum += num;
                count ++;
                average = (double) sum / count;
                if (num % 2 == 0) {
                    evens ++;
                } else {
                    odds ++;
                }
            }
        }

    }
}
