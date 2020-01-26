package phoneBehaviour;

public class Contact {
    private String position, phoneNumber, firstName, lastName;

    public Contact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String position, String phoneNumber, String firstName, String lastName) {
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Contact() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return position + '\'' +
                ", " + phoneNumber +
                ", '" + firstName + '\'' +
                " , '" + lastName + '\'';
    }
}

