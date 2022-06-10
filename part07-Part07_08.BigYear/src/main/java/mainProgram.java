
import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Birds birdsDatabase = new Birds();
        UserInterface userInterface = new UserInterface(scan, birdsDatabase);
        userInterface.start();
    }
}
