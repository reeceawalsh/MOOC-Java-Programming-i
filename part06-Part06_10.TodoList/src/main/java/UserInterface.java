import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList TodoList;

    public UserInterface(TodoList TodoList, Scanner scanner) {
        this.scanner = scanner;
        this.TodoList = TodoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("to add: ");
                String itemToAdd = scanner.nextLine();
                this.TodoList.add(itemToAdd);
            } else if (command.equals("list")) {
                this.TodoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int itemToRemove = Integer.valueOf(scanner.nextLine());
                this.TodoList.remove(itemToRemove);
        }
        }
    }
}
