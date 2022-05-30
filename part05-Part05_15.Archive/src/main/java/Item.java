public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Item)) {
            return false;
        }

        Item compareItems = (Item) compare;

        if (this.identifier.equals(compareItems.identifier)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
