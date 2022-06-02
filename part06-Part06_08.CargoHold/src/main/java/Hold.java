import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> cargoHold;

    public Hold(int maximumWeight) {
    this.maximumWeight = maximumWeight;
    this.cargoHold = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase item : cargoHold) {
            totalWeight += item.totalWeight();
        }
        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.cargoHold.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase item : this.cargoHold) {
            item.printItems();
        }
    }


    @Override
    public String toString() {
        return cargoHold.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
