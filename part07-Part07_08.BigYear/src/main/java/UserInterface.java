import java.util.Scanner;
public class UserInterface {
    private Scanner scan;
    private Birds birdsDatabase;
    public UserInterface(Scanner scan, Birds birdsDatabase) {
        this.birdsDatabase = birdsDatabase;
        this.scan = scan;
    }

    public void start() {
        listCommands();
        System.out.print("Command: ");
        String command = scan.nextLine();
        runCommand(command);
    }
    public void listCommands() {
        System.out.println("Add - adds a bird to the database");
        System.out.println("Observation - adds an observation to the database");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
    }

    public void runCommand(String command) {
        switch(command) {
            case "Add":
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName, 0);
                birdsDatabase.addBird(bird);
                break;
            case "Observation":
                System.out.print("Bird? ");
                name = scan.nextLine();
                boolean found = false;
                for (int i = 0; i < birdsDatabase.getBirdsDatabase().size(); i++) {
                    if (birdsDatabase.getBirdsDatabase().get(i).getName().equals(name)) {
                        found = true;
                        birdsDatabase.getBirdsDatabase().get(i).addObservation();
                    }
                }
                if (!found) {
                    System.out.println("Not a bird!");
                }
                break;
            case "All":
                System.out.println("");
                for (int i = 0; i < birdsDatabase.getBirdsDatabase().size(); i++) {
                    System.out.println(birdsDatabase.getBirdsDatabase().get(i));
                }
                break;
            case "One":
                System.out.print("Bird? ");
                name = scan.nextLine();
                for (int i = 0; i < birdsDatabase.getBirdsDatabase().size(); i++) {
                    if (birdsDatabase.getBirdsDatabase().get(i).getName().equals(name)) {
                        System.out.println(birdsDatabase.getBirdsDatabase().get(i));
                    }}
                 break;
            case "Quit":
                return;
        }
        System.out.println();
        start();
    }
}
