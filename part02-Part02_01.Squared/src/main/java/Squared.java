
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.valueOf(scanner.nextLine());
        int squared = integer * integer;

        System.out.println(squared);
    }
}
