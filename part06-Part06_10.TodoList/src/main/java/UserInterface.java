import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList TodoList;

    public UserInterface(Scanner scanner, TodoList TodoList) {
        this.scanner = scanner;
        this.TodoList = TodoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
        }
    }
}
