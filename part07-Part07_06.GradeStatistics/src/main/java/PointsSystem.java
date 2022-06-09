import java.util.ArrayList;

public class PointsSystem {
    private ArrayList<Integer> points;
    public PointsSystem() {
        this.points = new ArrayList<Integer>();
    }

    public void addPoints(int points) {
        if (points >= 0 && points < 101) {
            this.points.add(points);
        }
    }

    public int totalPoints() {
        int totalPoints = 0;
        for (Integer point : this.points) {
            totalPoints += point;
        }
        return totalPoints;
    }

    public int totalPassingPoints() {
        int totalPoints = 0;
        for (Integer point : this.points) {
            if (point >= 50) {
                totalPoints += point;
            }
        }
        return totalPoints;
    }

    public int count() {
        return points.size();
    }

    public int countOfPassingPoints() {
        int count = 0;
        for (Integer point : this.points) {
            if (point >= 50) {
                count ++;
            }
        }
        return count;
    }

    public double averageOfPoints() {
        return (double) totalPoints() / count();
    }

    public double averageOfPassingPoints() {
        return (double) totalPassingPoints() / countOfPassingPoints();
    }

    public double passPercentage() {
        return (double) 100 * countOfPassingPoints() / count();
    }
}
