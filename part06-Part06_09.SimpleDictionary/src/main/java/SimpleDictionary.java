
import java.util.HashMap;

public class SimpleDictionary {
    private String word;
    private String translation;

    public SimpleDictionary(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
