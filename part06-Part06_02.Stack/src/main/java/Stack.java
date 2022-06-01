import java.util.ArrayList;
public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return (this.stack.isEmpty());
    }

    public void add(String value) {
        this.stack.add((value));
    }

    public ArrayList<String> values() {
       return stack;
    }

    public String take() {
        String toReturn = stack.get(stack.size() - 1);
        stack.remove(stack.get(stack.size() - 1));
        return toReturn;

    }


}
