import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> jokes;
    public JokeManager() {
    this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            int max = this.jokes.size();
            double randomNum = Math.floor(Math.random() * max);
            return this.jokes.get((int)randomNum);
        }
    }

    public void printJokes() {
        if (this.jokes.isEmpty()) {
            System.out.println("There are no jokes yet, add your own!");
        }
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }


}
