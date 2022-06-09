import java.util.Scanner;
public class UserInterface {
    static Scanner scanner;
    private PointsSystem pointsSystem;
    public UserInterface(Scanner scanner, PointsSystem pointsSystem) {
        this.scanner = scanner;
        this.pointsSystem = pointsSystem;
    }
    public void start() {
        readPoints();
        System.out.println("");
        printPointAverage();
    }
    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(this.scanner.nextLine());
            if (points == -1) {
                break;
            } else {
                this.pointsSystem.addPoints(points);
            }
        }
    }
    public void printPointAverage() {
        System.out.println("Point average (all): " + pointsSystem.averageOfPoints());
    }
}
