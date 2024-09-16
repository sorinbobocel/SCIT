package phoneBehaviour;

public class Message extends Contact {
    private String phoneNumber;
    private String messageBody;

    public Message(String phoneNumber, String messageBody) {
        super(phoneNumber);
        this.messageBody = messageBody;
    }

    @Override
    public String toString() {
        return
                " Msg: " + messageBody;
    }

    public String getMessageBody() {
        return this.messageBody;
    }
}







