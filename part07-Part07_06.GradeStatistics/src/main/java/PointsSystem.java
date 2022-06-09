import java.util.ArrayList;

public class PointsSystem {
    private ArrayList<Integer> points;
    public PointsSystem() {
        this.points = new ArrayList<Integer>();
    }

    public void addPoints(int points) {
        this.points.add(points);
    }


    public int totalPoints() {
        int totalPoints = 0;
        for (Integer point : this.points) {
            totalPoints += point;
        }
        return totalPoints;
    }

    public int count() {
        return points.size();
    }

    public double averageOfPoints() {
        return (double) totalPoints() / count();
    }
}
