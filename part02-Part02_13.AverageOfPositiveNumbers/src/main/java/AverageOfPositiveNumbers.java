
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                double average = sum / count;
                if (sum > 0) {
                    System.out.println(average);
                } else {
                    System.out.println("Cannot calculate the average");
                }
            }

            sum = sum + num;
            count = count +1;


        }
    }
}
