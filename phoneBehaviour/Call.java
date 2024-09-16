package phoneBehaviour;

public class Call extends Contact {
    private String phoneNumber;

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Number " + phoneNumber;
    }
}
