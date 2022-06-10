import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> BirdsDatabase;
    public Birds() {
        this.BirdsDatabase = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.BirdsDatabase.add(bird);
    }
    public ArrayList<Bird> getBirdsDatabase() {
        return BirdsDatabase;
    }
}
