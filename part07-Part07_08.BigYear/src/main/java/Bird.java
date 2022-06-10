import java.util.ArrayList;

public class Bird {
    private String name;
    private String latinName;
    private int observations;

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
    @Override
    public String toString() {
        return getName() + " (" + getLatinName() + "): " + getObservations() + " observations";
    }
}
