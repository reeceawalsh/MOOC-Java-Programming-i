
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        // Creates a tool for reading input
        Scanner scanner = new Scanner(System.in);
        // Prints "write a message"
        System.out.println("Write a message:");
        // Reads the string written by the user and assign it to program memory. The string message = what ever the use input
        String message = scanner.nextLine();
        // Prints out the message variable which is the users input
        System.out.println(message);
    }
}
