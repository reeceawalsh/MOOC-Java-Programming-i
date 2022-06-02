import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        } else {
            Item heaviest = items.get(0);
            for (Item item : this.items) {
                if (item.getWeight() > heaviest.getWeight()) {
                    heaviest = item;
                }
            }
            return heaviest;
        }
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
