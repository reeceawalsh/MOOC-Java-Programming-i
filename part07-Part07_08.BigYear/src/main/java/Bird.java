import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private int observations;
    private ArrayList<Bird> birds;

    public Bird(String name, String latinName, int observations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = observations;
    }

    public void addObservation() {
        this.observations ++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}
