
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                String[] split = input.split(" ");
            for (String word: split) {
                    System.out.println(word);
                }
            }
        }
    }
}
