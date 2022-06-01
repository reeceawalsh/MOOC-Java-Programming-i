import java.util.ArrayList;
public class MessagingService {
    private ArrayList<Object> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        if (message.getContent().length() < 281) {
            this.messages.add(message);
        }
    }

    public ArrayList<Object> getMessages() {
        return messages;
    }
}
