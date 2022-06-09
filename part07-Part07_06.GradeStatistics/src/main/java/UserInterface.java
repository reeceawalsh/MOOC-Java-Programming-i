import java.util.Scanner;
public class UserInterface {
    static Scanner scanner;
    private PointsSystem pointsSystem;
    private GradeSystem gradeSystem;
    public UserInterface(Scanner scanner, PointsSystem pointsSystem, GradeSystem gradeSystem) {
        this.scanner = scanner;
        this.pointsSystem = pointsSystem;
        this.gradeSystem = gradeSystem;
    }
    public void start() {
        readPoints();
        printPointAverage();
        printPassingPointAverage();
        printPercentagePassed();
        printGrades();
    }
    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(this.scanner.nextLine());
            if (input == -1) {
                break;
            } else {
                this.pointsSystem.addPoints(input);
                this.gradeSystem.addGrade(input);
            }
        }
    }
    public void printPointAverage() {
        System.out.println("Point average (all): " + pointsSystem.averageOfPoints());
    }

    public void printPassingPointAverage() {
        if (pointsSystem.averageOfPassingPoints() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + pointsSystem.averageOfPassingPoints());
        }
    }

    public void printPercentagePassed() {
        System.out.println("Pass percentage: " + pointsSystem.passPercentage());
    }

    public void printGrades() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + gradeSystem.printGrade(gradeSystem.sortGrades(i)));
        }
    }
}
