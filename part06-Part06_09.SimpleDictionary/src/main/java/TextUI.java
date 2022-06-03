
import java.util.Scanner;

public class TextUI {

    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.simpleDictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.print("word: ");
                String word = scanner.nextLine();
                System.out.print("translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String wordToSearch = scanner.nextLine();
                if (this.simpleDictionary.translate(wordToSearch) == null) {
                    System.out.println("Word " + wordToSearch + " was not found");
                }
                else {
                    System.out.println("Translation: " + this.simpleDictionary.translate(wordToSearch));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
