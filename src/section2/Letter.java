package section2;

public class Letter {

    private final String sender;

    public Letter(final String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }
}
