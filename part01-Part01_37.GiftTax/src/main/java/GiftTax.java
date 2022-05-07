
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        double tax = 0;
        int lowerLimit = 0;
        double taxRate = 0;

        // Find correct boundary
        if (gift >= 5000 && gift < 25000) {
            tax = 100;
            taxRate = 0.08;
            lowerLimit = 5000;
        } else if (gift >= 25000 && gift < 55000) {
            tax = 1700;
            taxRate = 0.10;
            lowerLimit = 25000;
        } else if (gift >= 55000 && gift < 200000) {
            tax = 4700;
            taxRate = 0.12;
            lowerLimit = 55000;
        } else if (gift >= 200000 && gift < 1000000) {
            tax = 22100;
            taxRate = 0.15;
            lowerLimit = 200000;
        } else if (gift >= 1000000) {
            tax = 142100;
            taxRate = 0.17;
            lowerLimit = 1000000;
        }
        // Might be able to create a better system by starting high and working down.

        if (gift >= 5000) {
            System.out.println("Tax: " + (tax + (gift - lowerLimit) * taxRate));
        } else {
            System.out.println("No tax!");
        }
    }
}
