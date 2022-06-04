import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDoList;
    public TodoList() {
        this.toDoList = new ArrayList<>();
    }

    public void add(String task) {
        this.toDoList.add(task);
    }

    public void print() {
        int itemNum = 1;
        for (String item : this.toDoList) {
            System.out.println(itemNum + ": " + item);
            itemNum ++;
        }
    }

    public void remove(int number) {
        this.toDoList.remove(number - 1);
    }

}
